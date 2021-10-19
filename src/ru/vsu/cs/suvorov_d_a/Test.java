package ru.vsu.cs.suvorov_d_a;

public class Test {
        public boolean makeColorCheck(Picture picture){
            if ((picture.getColor(-3.5, 3) == SimpleColor.WHITE)
                    && (picture.getColor(-2, 2) == SimpleColor.GREEN)
                    && (picture.getColor(-0.5, 3) == SimpleColor.BLUE)
                    && (picture.getColor(-1, 1) == SimpleColor.ORANGE)
                    && (picture.getColor(-2, 0.5) == SimpleColor.ORANGE)
                    && (picture.getColor(8, -3) == SimpleColor.BLUE)
                    && (picture.getColor(3, 3) == SimpleColor.ORANGE)
                    && (picture.getColor(-7, -3) == SimpleColor.WHITE)
                    && (picture.getColor(-2, 7) == SimpleColor.GREEN)
                    && (picture.getColor(-0.25, 4.5) == SimpleColor.ORANGE)) {
                return true;
            } else return false;
        }
}