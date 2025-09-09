package org.timeConvertor;

import java.util.*;

public class Util {

    private static final Map<Integer, String> numberToWord = new HashMap<>();

    static {
        // 1–19
        numberToWord.put(1, "one");
        numberToWord.put(2, "two");
        numberToWord.put(3, "three");
        numberToWord.put(4, "four");
        numberToWord.put(5, "five");
        numberToWord.put(6, "six");
        numberToWord.put(7, "seven");
        numberToWord.put(8, "eight");
        numberToWord.put(9, "nine");
        numberToWord.put(10, "ten");
        numberToWord.put(11, "eleven");
        numberToWord.put(12, "twelve");
        numberToWord.put(13, "thirteen");
        numberToWord.put(14, "fourteen");
        numberToWord.put(15, "fifteen");
        numberToWord.put(16, "sixteen");
        numberToWord.put(17, "seventeen");
        numberToWord.put(18, "eighteen");
        numberToWord.put(19, "nineteen");

        // Tens
        numberToWord.put(20, "twenty");
        numberToWord.put(30, "thirty");
        numberToWord.put(40, "forty");
        numberToWord.put(50, "fifty");
    }

    public static String convertToWord(int value) {
        if (numberToWord.containsKey(value)) {
            return numberToWord.get(value);
        }
        if (value < 60) {
            int tens = (value / 10) * 10;
            int ones = value % 10;
            return numberToWord.get(tens) + "-" + numberToWord.get(ones);
        }
        return String.valueOf(value); // fallback (shouldn't happen for this use case)
    }
}
