package org.hms.util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {

        while (true) {

            try {

                System.out.print(message);

                int value = Integer.parseInt(
                        scanner.nextLine()
                );

                return value;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number."
                );
            }
        }
    }

    public static double readDouble(String message) {

        while (true) {

            try {

                System.out.print(message);

                double value = Double.parseDouble(
                        scanner.nextLine()
                );

                return value;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid amount."
                );
            }
        }
    }

    public static String readString(String message) {

        System.out.print(message);

        return scanner.nextLine();
    }
}