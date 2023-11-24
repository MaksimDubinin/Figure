package figuri;

import java.util.ArrayList;

public class Circle extends Figure {

    private ArrayList<Integer> Point;
    private int count;
    public Circle(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }
    @Override
    public  boolean isFigureValid() {
        if ((Point.size() == FOUR && (Point.get(0) != Point.get(INDEX_TWO) || Point.get(1) != Point.get(INDEX_THREE))) && count == DEGREE) {
            return true;
        } else if ((Point.size() == SIX && (Point.get(0) != Point.get(INDEX_THREE) || Point.get(1) != Point.get(INDEX_FOUR) || Point.get(INDEX_TWO) != Point.get(INDEX_FIVE))) && count == DEGREE) {
            return true;
        }
        return false;
    }

    @Override
    public void areaFigure() {
        if (Point.size() == FOUR) {
            double radius = (double) (Math.pow(Point.get(0) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_THREE), DEGREE));
            System.out.printf("%.2f", Math.PI * radius);
        } else if (Point.size() == SIX) {
            double radius = (double) (Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FIVE), DEGREE));
            System.out.printf("%.2f", Math.PI * radius);
        }
    }

    @Override
    public void perimetrFigure() {
        if (Point.size() == FOUR) {
            double radius = (Double) (Math.pow(Point.get(0) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_THREE), DEGREE));
            System.out.printf("%.2f", Math.PI * 2 * Math.sqrt(radius));
        } else if (Point.size() == SIX) {
            Double radius = (Double) (Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FIVE), DEGREE));
            System.out.printf("%.2f", Math.PI * 2 * Math.sqrt(radius));
        }

    }
}
