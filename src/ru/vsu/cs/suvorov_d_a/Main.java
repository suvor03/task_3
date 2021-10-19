package ru.vsu.cs.suvorov_d_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        if (!test.makeColorCheck(picture)) {
            System.out.println("Error. Test are not completed.");
            return;
        } else {
            System.out.println("Successful. Test are completed");
        }

        double x = readNumber("X: ");
        checkNumberPositive(x);
        double y = readNumber("Y: ");
        checkNumberPositive(y);

        printColorPoint(x, y);
    }

    private static final Picture picture = new Picture();
    private static final Test test = new Test();

    public static void printColorPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(picture.getColor(x, y));
    }

    private static double readNumber(String value) {
        System.out.print("Input " + value);

        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    private static void checkNumberPositive(double num) {
        if (num <= -10 || num >= 10) {
            System.out.println("Error. The entered number doesn't match the condition.");
            System.exit(1);
        }
    }
}