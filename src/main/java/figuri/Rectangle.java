package figuri;

import java.util.ArrayList;

public class Rectangle extends Figure {

    private ArrayList<Integer> point;
    private int count;

    public Rectangle(ArrayList<Integer> point, int count) {
        this.point = point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (point.size() == EIGHT) {
            int side1 = (int) (Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE));
            int side2 = (int) (Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE));
            int side3 = (int) (Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_SEVEN), DEGREE));
            int side4 = (int) (Math.pow(point.get(INDEX_SIX) - point.get(0), DEGREE) + Math.pow(point.get(INDEX_SEVEN) - point.get(1), DEGREE));

            double diag1 = Math.pow(point.get(0) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FIVE), DEGREE);
            double diag2 = Math.pow(point.get(INDEX_TWO) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SEVEN), DEGREE);

            return count == FOUR && side1 == side3 && side2 == side4 && diag2 == diag1;
        } else if (point.size() == TWELVE) {
            int side1 = (int) (Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow((point.get(1) - point.get(INDEX_FOUR)), DEGREE) + Math.pow((point.get(INDEX_TWO) - point.get(INDEX_FIVE)), DEGREE));
            int side2 = (int) (Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow((point.get(INDEX_FOUR) - point.get(INDEX_SEVEN)), DEGREE) + Math.pow((point.get(INDEX_FIVE) - point.get(INDEX_EIGHT)), DEGREE));
            int side3 = (int) (Math.pow(point.get(INDEX_SIX) - point.get(INDEX_NINE), DEGREE) + Math.pow((point.get(INDEX_SEVEN) - point.get(INDEX_TEN)), DEGREE) + Math.pow((point.get(INDEX_EIGHT) - point.get(INDEX_ELEVEN)), DEGREE));
            int side4 = (int) (Math.pow(point.get(INDEX_NINE) - point.get(0), DEGREE) + Math.pow((point.get(INDEX_TEN) - point.get(1)), DEGREE) + Math.pow((point.get(INDEX_ELEVEN) - point.get(INDEX_TWO)), DEGREE));

            double diag1 = Math.pow(point.get(0) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_EIGHT), DEGREE);
            double diag2 = Math.pow(point.get(INDEX_THREE) - point.get(INDEX_NINE), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_TEN), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_ELEVEN), DEGREE);

            return count == FOUR && side1 == side3 && side2 == side4 && diag2 == diag1;
        }
        return false;
    }

    @Override
    public double calculateAreaFigure() {
        if (point.size() == EIGHT) {
            System.out.printf("The figure area %.2f" + "\n", Math.sqrt((Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE)) * (Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE))));
            return Math.sqrt((Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE)) * (Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE)));
        } else if (point.size() == TWELVE) {
            System.out.printf("The figure area %.2f" + "\n", Math.sqrt((Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE)) * (Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_EIGHT), DEGREE))));
            return Math.sqrt((Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE)) * (Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_EIGHT), DEGREE)));
        }
        return -1;
    }

    @Override
    public double calculatePerimetrFigure() {
        if (point.size() == EIGHT) {
            System.out.printf("The figure perimeter %.2f" + "\n", 2 * Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE)) + 2 * Math.sqrt(Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE)));
            return 2 * Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE)) + 2 * Math.sqrt(Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE));
        } else if (point.size() == TWELVE) {
            System.out.printf("The figure perimeter %.2f" + "\n", 2 * Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE)) + 2 * Math.sqrt(Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_EIGHT), DEGREE)));
            return 2 * Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE)) + 2 * Math.sqrt(Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_EIGHT), DEGREE));
        }
        return -1;
    }
}