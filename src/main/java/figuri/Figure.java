package figuri;
import java.util.ArrayList;

public class Figure {

    public static final int DEGREE = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TWELVE = 12;
    public static final int INDEX_TWO = 2;
    public static final int INDEX_THREE = 3;
    public static final int INDEX_FOUR = 4;
    public static final int INDEX_FIVE = 5;
    public static final int INDEX_SIX = 6;
    public static final int INDEX_SEVEN = 7;
    public static final int INDEX_EIGHT = 8;
    public static final int INDEX_NINE = 9;
    public static final int INDEX_TEN = 10;
    public static final int INDEX_ELEVEN = 11;

    public static Figure createNewFigure(String figure, ArrayList<Integer> point, int count) {
        if (figure.equals("CIRCLE")) {
            return new Circle(point, count);
        } else if (figure.equals("SQUARE")) {
            return new Square(point, count);
        } else if (figure.equals("RECTANGLE")) {
            return new Rectangle(point, count);
        } else if (figure.equals("PARALLELOGRAM")) {
            return new Parallelogram(point, count);
        } else if (figure.equals("TRIANGLE")) {
            return new Triangle(point, count);
        } else if (figure.equals("POLYGON")) {
            return new Polygon(point, count);
        } else if (figure.equals("SPHERE")) {
            return new Sphere(point, count);
        } else if (figure.equals("TRUNCATED_SPHERE")) {
            return new TruncatedSphere(point, count);
        } else if (figure.equals("CYLINDER")) {
            return new Cylinder(point, count);
        } else if (figure.equals("CONE")) {
            return new Cone(point, count);
        } else if (figure.equals("FIGURE")) {
            return new Figure();
        }
        return new Figure();
    }
    public boolean isFigureValid() {
        return true;
    }
    public double calculateAreaFigure() {
        System.out.println("The figure has no area");
        return -1;
    }
    public double calculatePerimetrFigure() {
        System.out.println("The figure has no perimeter");
        return -1;
    }
}