package ru.vsu.cs.suvorov_d_a;

import ru.vsu.cs.suvorov_d_a.figures.Line;
import ru.vsu.cs.suvorov_d_a.figures.Circle;
import ru.vsu.cs.suvorov_d_a.figures.Rectangle;
import java.awt.geom.Point2D;

public class Picture {
    public static final Rectangle R = new Rectangle(new Point2D.Double(-3, 0), new Point2D.Double(7, 8));
    public static final Line L = new Line(-1, 2, 4);
    public static final Circle C = new Circle(-2, 3, 2);

    public static SimpleColor getColor(double x, double y) {

        if (L.isPointAboveLine(x, y) && !R.isPointInsideRectangle(x, y)) {
            return SimpleColor.WHITE;
        }

        else if (!L.isPointAboveLine(x, y) && !R.isPointInsideRectangle(x, y)) {
            return SimpleColor.BLUE;
        }

        else if (!L.isPointAboveLine(x, y) && !C.isPointInsideCircle(x, y) && R.isPointInsideRectangle(x, y)) {
            return SimpleColor.ORANGE;
        }

        else if (!L.isPointAboveLine(x, y) && C.isPointInsideCircle(x, y)) {
            return SimpleColor.BLUE;
        }

        else if (L.isPointAboveLine(x, y) && !C.isPointInsideCircle(x, y) && y<1.5) {
            return SimpleColor.ORANGE;
        }

        else {
            return SimpleColor.GREEN;
        }
    }
}