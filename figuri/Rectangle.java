package figuri;

import java.util.ArrayList;

public class Rectangle extends Figure {

    private ArrayList<Integer> Point;
    private int count;

    public Rectangle(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (Point.size() == EIGHT) {
            int side1 = (int) (Math.pow(Point.get(0) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_THREE), DEGREE));
            int side2 = (int) (Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_FIVE), DEGREE));
            int side3 = (int) (Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(INDEX_SEVEN), DEGREE));
            int side4 = (int) (Math.pow(Point.get(INDEX_SIX) - Point.get(0), DEGREE) + Math.pow(Point.get(INDEX_SEVEN) - Point.get(1), DEGREE));
            double diag1 = Math.pow(Point.get(0) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FIVE), DEGREE);
            double diag2 = Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_SEVEN), DEGREE);
            if (count == FOUR && side1 == side3 && side2 == side4 && diag2 == diag1) {
                return true;
            }
        } else if (Point.size() == TWELVE) {
            int side1 = (int) (Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow((Point.get(1) - Point.get(INDEX_FOUR)), DEGREE) + Math.pow((Point.get(INDEX_TWO) - Point.get(INDEX_FIVE)), DEGREE));
            int side2 = (int) (Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_SIX), DEGREE) + Math.pow((Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN)), DEGREE) + Math.pow((Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT)), DEGREE));
            int side3 = (int) (Math.pow(Point.get(INDEX_SIX) - Point.get(INDEX_NINE), DEGREE) + Math.pow((Point.get(INDEX_SEVEN) - Point.get(INDEX_TEN)), DEGREE) + Math.pow((Point.get(INDEX_EIGHT) - Point.get(INDEX_ELEVEN)), DEGREE));
            int side4 = (int) (Math.pow(Point.get(INDEX_NINE) - Point.get(0), DEGREE) + Math.pow((Point.get(INDEX_TEN) - Point.get(1)), DEGREE) + Math.pow((Point.get(INDEX_ELEVEN) - Point.get(INDEX_TWO)), DEGREE));
            double diag1 = Math.pow(Point.get(0) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_SEVEN), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_EIGHT), DEGREE);
            double diag2 = Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_NINE), DEGREE) + Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_TEN), DEGREE) + Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_ELEVEN), DEGREE);
            if (count == FOUR && side1 == side3 && side2 == side4 && diag2 == diag1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void areaFigure() {
        if (Point.size() == EIGHT) {
            System.out.printf("%.2f", Math.sqrt((Math.pow(Point.get(0) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_THREE), DEGREE)) * (Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_FIVE), DEGREE))));
        } else if (Point.size() == TWELVE) {
            System.out.printf("%.2f", Math.sqrt((Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FIVE), DEGREE)) * (Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT), DEGREE))));
        }
    }

    @Override
    public void perimetrFigure() {
        if (Point.size() == EIGHT) {
            System.out.printf("%.2f", 2 * Math.sqrt(Math.pow(Point.get(0) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_THREE), DEGREE)) + 2 * Math.sqrt(Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_FIVE), DEGREE)));
        } else if (Point.size() == TWELVE) {
            System.out.printf("%.2f", 2 * Math.sqrt(Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FIVE), DEGREE)) + 2 * Math.sqrt(Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT), DEGREE)));
        }
    }
}