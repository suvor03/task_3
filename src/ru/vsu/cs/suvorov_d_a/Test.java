package ru.vsu.cs.suvorov_d_a;

public class Test {
    public boolean makeColorCheck(Picture picture) {
        if (picture.getColor(-3.5, 3) != SimpleColor.WHITE) {
            System.out.println("-3.5, 3 test not completed");
            return false;
        } else if (picture.getColor(-2, 2) != SimpleColor.GREEN) {
            System.out.println("-2, 2 test not completed");
            return false;
        } else if (picture.getColor(-0.5, 3) != SimpleColor.BLUE) {
            System.out.println("-0.5, 3 test not completed");
            return false;
        } else if (picture.getColor(-1, 1) != SimpleColor.ORANGE) {
            System.out.println("-1, 1 test not completed");
            return false;
        } else if (picture.getColor(-2, 0.5) != SimpleColor.ORANGE) {
            System.out.println("-2, 0.5 test not completed");
            return false;
        } else if (picture.getColor(8, -3) != SimpleColor.BLUE) {
            System.out.println("8, -3 test not completed");
            return false;
        } else if (picture.getColor(3, 3) != SimpleColor.ORANGE) {
            System.out.println("3, 3 test not completed");
            return false;
        } else if (picture.getColor(-7, -3) != SimpleColor.WHITE) {
            System.out.println("-7, -3 test not completed");
            return false;
        } else if (picture.getColor(-2, 7) != SimpleColor.GREEN) {
            System.out.println("-2, 7 test not completed");
            return false;
        } else if (picture.getColor(-0.25, 4.5) != SimpleColor.ORANGE) {
            System.out.println("-0.25, 4.5 test not completed");
            return false;
        } else {
            return true;
        }
    }
}