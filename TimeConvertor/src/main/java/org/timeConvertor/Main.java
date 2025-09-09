package org.timeConvertor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide input time (hh:mm): ");
        String time = scanner.next();
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        TimeConvertor timeConvertor = new TimeConvertor();
        String convertedTime = timeConvertor.convertTimeToBritish(hours, minutes);
        System.out.println("Converted time is: " + convertedTime);
    }
}
