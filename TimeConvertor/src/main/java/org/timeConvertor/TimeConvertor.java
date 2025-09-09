package org.timeConvertor;

public class TimeConvertor {

    public String convertTimeToBritish(int hours, int minutes) {
        // Special cases for midnight and noon
        if (hours == 0 && minutes == 0) {
            return "midnight";
        } else if (hours == 12 && minutes == 0) {
            return "noon";
        }

        int displayHour = hours % 12 == 0 ? 12 : hours % 12;
        String result;

        if (minutes == 0) {
            result = Util.convertToWord(displayHour) + " o'clock";
        } else if (minutes == 15) {
            result = "quarter past " + Util.convertToWord(displayHour);
        } else if (minutes == 30) {
            result = "half past " + Util.convertToWord(displayHour);
        } else if (minutes == 45) {
            int nextHour = (displayHour % 12) + 1;
            result = "quarter to " + Util.convertToWord(nextHour);
        } else if (minutes < 30) {
            result = Util.convertToWord(minutes) + " past " + Util.convertToWord(displayHour);
        } else {
            int nextHour = (displayHour % 12) + 1;
            result = Util.convertToWord(60 - minutes) + " to " + Util.convertToWord(nextHour);
        }
        return result;
    }
}

