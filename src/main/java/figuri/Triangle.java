package figuri;

import java.util.ArrayList;

public class Triangle extends Figure {

    private ArrayList<Integer> point;
    private int count;
    public Triangle(ArrayList<Integer> point, int count) {
        this.point = point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        return (count == THREE && point.size() == SIX && (!point.get(INDEX_TWO).equals(point.get(INDEX_FOUR)) || !point.get(INDEX_THREE).equals(point.get(INDEX_FIVE))) && (!point.get(0).equals(point.get(INDEX_FOUR)) || !point.get(1).equals(point.get(INDEX_FIVE))) && (!point.get(0).equals(point.get(INDEX_TWO)) || !point.get(1).equals(point.get(INDEX_THREE))))
                || (count == THREE && point.size() == NINE && (!point.get(0).equals(point.get(INDEX_SIX)) || !point.get(1).equals(point.get(INDEX_SEVEN)) || !point.get(INDEX_TWO).equals(point.get(INDEX_EIGHT))) && (!point.get(INDEX_THREE).equals(point.get(INDEX_SIX)) || !point.get(INDEX_FOUR).equals(point.get(INDEX_SEVEN)) || !point.get(INDEX_FIVE).equals(point.get(INDEX_EIGHT))) && (!point.get(0).equals(point.get(INDEX_THREE)) || !point.get(1).equals(point.get(INDEX_FOUR)) || !point.get(INDEX_TWO).equals(point.get(INDEX_FIVE))));
    }

    @Override
    public void calculateAreaFigure() {
        if (point.size() == SIX) {
            double side1 = Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE));
            double side2 = Math.sqrt(Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE));
            double side3 = Math.sqrt(Math.pow(point.get(INDEX_FOUR) - point.get(0), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(1), DEGREE));

            double halfperimetr = (side1 + side2 + side3) / 2;

            System.out.printf("The figure area %.2f" + "\n", Math.sqrt(halfperimetr * (halfperimetr - side1) * (halfperimetr - side2) * (halfperimetr - side3)));
        } else if (point.size() == NINE) {
            double side1 = Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE));
            double side2 = Math.sqrt(Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_EIGHT), DEGREE));
            double side3 = Math.sqrt(Math.pow(point.get(INDEX_SIX) - point.get(0), DEGREE) + Math.pow(point.get(INDEX_SEVEN) - point.get(1), DEGREE) + Math.pow(point.get(INDEX_EIGHT) - point.get(INDEX_TWO), DEGREE));

            double halfperimetr = (side1 + side2 + side3) / 2;

            System.out.printf("The figure area %.2f" + "\n", Math.sqrt(halfperimetr * (halfperimetr - side1) * (halfperimetr - side2) * (halfperimetr - side3)));
        }
    }

    @Override
    public void calculatePerimetrFigure() {
        if (point.size() == SIX) {
            double side1 = Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE));
            double side2 = Math.sqrt(Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE));
            double side3 = Math.sqrt(Math.pow(point.get(INDEX_FOUR) - point.get(0), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(1), DEGREE));

            System.out.printf("The figure perimeter %.2f" + "\n", side1 + side2 + side3);
        } else if (point.size() == NINE) {
            double side1 = Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE));
            double side2 = Math.sqrt(Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_EIGHT), DEGREE));
            double side3 = Math.sqrt(Math.pow(point.get(INDEX_SIX) - point.get(0), DEGREE) + Math.pow(point.get(INDEX_SEVEN) - point.get(1), DEGREE) + Math.pow(point.get(INDEX_EIGHT) - point.get(INDEX_TWO), DEGREE));

            System.out.printf("The figure perimeter %.2f" + "\n", side1 + side2 + side3);
        }
    }
}