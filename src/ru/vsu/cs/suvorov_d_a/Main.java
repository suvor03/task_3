package ru.vsu.cs.suvorov_d_a;

import java.util.Locale;
import java.util.Scanner;

import static ru.vsu.cs.suvorov_d_a.Picture.getColor;
import static ru.vsu.cs.suvorov_d_a.Test.makeTest;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        makeTest();

        double x = readNumber("X: ");
        checkNumberPositive(x);

        double y = readNumber("Y: ");
        checkNumberPositive(y);

        printColorPoint(x, y);
    }

    public static void printColorPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(getColor(x, y));
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