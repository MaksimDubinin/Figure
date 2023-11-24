package figuri;

import java.util.ArrayList;

public class Parallelogram extends Figure {

    private ArrayList<Integer> Point;
    private int count;
    public Parallelogram(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (Point.size() == EIGHT) {
            double side1 = Math.pow(Point.get(0) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_THREE), DEGREE);
            double side2 = Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_FIVE), DEGREE);
            double side3 = Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(INDEX_SEVEN), DEGREE);
            double side4 = Math.pow(Point.get(INDEX_SIX) - Point.get(0), DEGREE) + Math.pow(Point.get(INDEX_SEVEN) - Point.get(1), DEGREE);
            if (count == FOUR && side1 == side3 && side2 == side4) {
                return true;
            }
        } else if (Point.size() == TWELVE) {
            int side1 = (int) (Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow((Point.get(1) - Point.get(INDEX_FOUR)), DEGREE) + Math.pow((Point.get(INDEX_TWO) - Point.get(INDEX_FIVE)), DEGREE));
            int side2 = (int) (Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_SIX), DEGREE) + Math.pow((Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN)), DEGREE) + Math.pow((Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT)), DEGREE));
            int side3 = (int) (Math.pow(Point.get(INDEX_SIX) - Point.get(INDEX_NINE), DEGREE) + Math.pow((Point.get(INDEX_SEVEN) - Point.get(INDEX_TEN)), DEGREE) + Math.pow((Point.get(INDEX_EIGHT) - Point.get(INDEX_ELEVEN)), DEGREE));
            int side4 = (int) (Math.pow(Point.get(INDEX_NINE) - Point.get(0), DEGREE) + Math.pow((Point.get(INDEX_TEN) - Point.get(1)), DEGREE) + Math.pow((Point.get(INDEX_ELEVEN) - Point.get(INDEX_TWO)), DEGREE));
            if (count == FOUR && side1 == side3 && side2 == side4) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void areaFigure() {
        if (Point.size() == EIGHT) {
            double diag1 = Math.sqrt(Math.pow(Point.get(0) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FIVE), DEGREE));
            double diag2 = Math.sqrt(Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_SEVEN), DEGREE));
            double cos = ((Point.get(INDEX_FOUR) - Point.get(0)) * (Point.get(INDEX_SIX) - Point.get(INDEX_TWO)) + ((Point.get(INDEX_FIVE) - Point.get(1)) * (Point.get(INDEX_SEVEN) - Point.get(INDEX_THREE)))) / (Math.sqrt(Math.pow((Point.get(INDEX_FOUR) - Point.get(0)), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(1), DEGREE)) * Math.sqrt(Math.pow(Point.get(INDEX_SIX) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(INDEX_SEVEN) - Point.get(INDEX_THREE), DEGREE)));
            System.out.printf("%.2f", diag1 * diag2 * Math.sqrt(1 - Math.pow(cos, DEGREE)) / 2 );
            System.out.println(cos);
        } else if (Point.size() == TWELVE) {
            double diag1 = Math.sqrt(Math.pow(Point.get(0) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_SEVEN), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_EIGHT), DEGREE));
            double diag2 = Math.sqrt(Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_NINE), DEGREE) + Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_TEN), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(INDEX_ELEVEN), DEGREE));
            double cos =  (((Point.get(INDEX_SIX) - Point.get(0)) * (Point.get(INDEX_NINE) - Point.get(INDEX_THREE))) + ((Point.get(INDEX_SEVEN) - Point.get(1)) * (Point.get(INDEX_TEN) - Point.get(INDEX_FOUR))) + ((Point.get(INDEX_EIGHT) - Point.get(INDEX_TWO)) * (Point.get(INDEX_ELEVEN) - Point.get(INDEX_FIVE)))) / (Math.sqrt(Math.pow(Point.get(INDEX_SIX) - Point.get(0), DEGREE) + Math.pow(Point.get(INDEX_SEVEN) - Point.get(1), DEGREE) + Math.pow(Point.get(INDEX_EIGHT) - Point.get(INDEX_TWO), DEGREE)) * Math.sqrt(Math.pow(Point.get(INDEX_NINE) - Point.get(INDEX_THREE), DEGREE) + Math.pow(Point.get(INDEX_TEN) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_ELEVEN) - Point.get(INDEX_FIVE), DEGREE)));
            System.out.printf("%.2f", diag1 * diag2 * Math.sqrt(1 - Math.pow(cos , DEGREE)) / DEGREE);
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