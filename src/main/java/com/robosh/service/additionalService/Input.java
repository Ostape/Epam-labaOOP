package com.robosh.service.additionalService;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private static Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    public static double checkDoubleValue() {
        double number;
        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.println("You should enter numbers!");
        }
        number = scan.nextDouble();
        scan.nextLine();
        return number;
    }

    public static int checkIntegerValue() {
        int number;
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("You should enter numbers!");
        }
        number = scan.nextInt();
        scan.nextLine();
        return number;
    }

    public static String inputString() {
        return scan.nextLine();
    }

}
