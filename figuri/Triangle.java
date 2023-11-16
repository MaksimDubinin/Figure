package figuri;

import java.util.ArrayList;

public class Triangle extends Figure {

    private ArrayList<Integer> Point;
    private int count;
    public Triangle(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (count == THREE && Point.size() == SIX && (Point.get(INDEX_TWO) != Point.get(INDEX_FOUR) || Point.get(INDEX_THREE) != Point.get(INDEX_FIVE)) && (Point.get(0) != Point.get(INDEX_FOUR) || Point.get(1) != Point.get(INDEX_FIVE)) && (Point.get(0) != Point.get(INDEX_TWO) || Point.get(1) != Point.get(INDEX_THREE)) && (Point.get(INDEX_FOUR) - Point.get(0) / Point.get(INDEX_TWO) - Point.get(0) != Point.get(INDEX_FIVE) - Point.get(1) / Point.get(INDEX_THREE) - Point.get(1))) {
            return true;
        } else if (count == THREE && Point.size() == NINE && (Point.get(0) != Point.get(INDEX_SIX) || Point.get(1) != Point.get(INDEX_SEVEN) || Point.get(INDEX_TWO) != Point.get(INDEX_EIGHT)) && (Point.get(INDEX_THREE) != Point.get(INDEX_SIX) || Point.get(INDEX_FOUR) != Point.get(INDEX_SEVEN) || Point.get(INDEX_FIVE) != Point.get(INDEX_EIGHT)) && (Point.get(0) != Point.get(INDEX_THREE) || Point.get(1) != Point.get(INDEX_FOUR) || Point.get(INDEX_TWO) != Point.get(INDEX_FIVE)) && (Point.get(0) - Point.get(INDEX_THREE) / Point.get(INDEX_SIX) - Point.get(INDEX_THREE)) != (Point.get(1) - Point.get(INDEX_FOUR) / Point.get(INDEX_SEVEN) - Point.get(INDEX_FOUR)) && (Point.get(0) - Point.get(INDEX_THREE) / Point.get(INDEX_SIX) - Point.get(INDEX_THREE)) != (Point.get(INDEX_TWO) - Point.get(INDEX_FIVE) / Point.get(INDEX_EIGHT) - Point.get(INDEX_FIVE)) && (Point.get(INDEX_TWO) - Point.get(INDEX_FIVE) / Point.get(INDEX_EIGHT) - Point.get(INDEX_FIVE) != (Point.get(1) - Point.get(INDEX_FOUR) / Point.get(INDEX_SEVEN) - Point.get(INDEX_FOUR)))) {
            return true;
        }
        return false;
    }

    @Override
    public void areaFigure() {
        if (Point.size() == SIX) {
            double side1 = Math.sqrt(Math.pow(Point.get(0) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_THREE), DEGREE));
            double side2 = Math.sqrt(Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_FIVE), DEGREE));
            double side3 = Math.sqrt(Math.pow(Point.get(INDEX_FOUR) - Point.get(0), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(1), DEGREE));
            double halfperimetr = (side1 + side2 + side3) / 2;
            System.out.printf("%.2f", Math.sqrt(halfperimetr * (halfperimetr - side1) * (halfperimetr - side2) * (halfperimetr - side3)));
        } else if (Point.size() == NINE) {
            double side1 = Math.sqrt(Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FIVE), DEGREE));
            double side2 = Math.sqrt(Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT), DEGREE));
            double side3 = Math.sqrt(Math.pow(Point.get(INDEX_SIX) - Point.get(0), DEGREE) + Math.pow(Point.get(INDEX_SEVEN) - Point.get(1), DEGREE) + Math.pow(Point.get(INDEX_EIGHT) - Point.get(INDEX_TWO), DEGREE));
            double halfperimetr = (side1 + side2 + side3) / 2;
            System.out.printf("%.2f", Math.sqrt(halfperimetr * (halfperimetr - side1) * (halfperimetr - side2) * (halfperimetr - side3)));
        }
    }

    @Override
    public void perimetrFigure() {
        if (Point.size() == SIX) {
            double side1 = Math.sqrt(Math.pow(Point.get(0) - Point.get(INDEX_TWO), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_THREE), DEGREE));
            double side2 = Math.sqrt(Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_FIVE), DEGREE));
            double side3 = Math.sqrt(Math.pow(Point.get(INDEX_FOUR) - Point.get(0), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(1), DEGREE));
            System.out.printf("%.2f", side1 + side2 + side3);
        } else if (Point.size() == NINE) {
            double side1 = Math.sqrt(Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FIVE), DEGREE));
            double side2 = Math.sqrt(Math.pow(Point.get(INDEX_THREE) - Point.get(INDEX_SIX), DEGREE) + Math.pow(Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN), DEGREE) + Math.pow(Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT), DEGREE));
            double side3 = Math.sqrt(Math.pow(Point.get(INDEX_SIX) - Point.get(0), DEGREE) + Math.pow(Point.get(INDEX_SEVEN) - Point.get(1), DEGREE) + Math.pow(Point.get(INDEX_EIGHT) - Point.get(INDEX_TWO), DEGREE));
            System.out.printf("%.2f", side1 + side2 + side3);
        }
    }
}