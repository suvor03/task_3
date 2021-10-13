package ru.vsu.cs.suvorov_d_a.figures;

public class Circle {
    public double x0;
    public double y0;
    public double radius;

    public Circle(double x0, double y0, double radius) {
        this.x0 = x0;
        this.y0 = y0;
        this.radius = radius;
    }

    public boolean isPointInsideCircle(double x, double y) {
        return Math.pow(x - x0, 2) + Math.pow(y - y0, 2) < Math.pow(radius, 2);
    }
}