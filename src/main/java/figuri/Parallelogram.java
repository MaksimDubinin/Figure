package figuri;

import java.util.ArrayList;

public class Parallelogram extends Figure {

    private ArrayList<Integer> point;
    private int count;
    public Parallelogram(ArrayList<Integer> point, int count) {
        this.point = point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (point.size() == EIGHT) {
            double side1 = Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE);
            double side2 = Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE);
            double side3 = Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_SEVEN), DEGREE);
            double side4 = Math.pow(point.get(INDEX_SIX) - point.get(0), DEGREE) + Math.pow(point.get(INDEX_SEVEN) - point.get(1), DEGREE);

            return count == FOUR && side1 == side3 && side2 == side4;
        } else if (point.size() == TWELVE) {
            int side1 = (int) (Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow((point.get(1) - point.get(INDEX_FOUR)), DEGREE) + Math.pow((point.get(INDEX_TWO) - point.get(INDEX_FIVE)), DEGREE));
            int side2 = (int) (Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow((point.get(INDEX_FOUR) - point.get(INDEX_SEVEN)), DEGREE) + Math.pow((point.get(INDEX_FIVE) - point.get(INDEX_EIGHT)), DEGREE));
            int side3 = (int) (Math.pow(point.get(INDEX_SIX) - point.get(INDEX_NINE), DEGREE) + Math.pow((point.get(INDEX_SEVEN) - point.get(INDEX_TEN)), DEGREE) + Math.pow((point.get(INDEX_EIGHT) - point.get(INDEX_ELEVEN)), DEGREE));
            int side4 = (int) (Math.pow(point.get(INDEX_NINE) - point.get(0), DEGREE) + Math.pow((point.get(INDEX_TEN) - point.get(1)), DEGREE) + Math.pow((point.get(INDEX_ELEVEN) - point.get(INDEX_TWO)), DEGREE));

            return  count == FOUR && side1 == side3 && side2 == side4;
        }
        return false;
    }

    @Override
    public void calculateAreaFigure() {
        if (point.size() == EIGHT) {
            double diag1 = Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FIVE), DEGREE));
            double diag2 = Math.sqrt(Math.pow(point.get(INDEX_TWO) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SEVEN), DEGREE));
            double cos = ((point.get(INDEX_FOUR) - point.get(0)) * (point.get(INDEX_SIX) - point.get(INDEX_TWO)) + ((point.get(INDEX_FIVE) - point.get(1)) * (point.get(INDEX_SEVEN) - point.get(INDEX_THREE)))) / (Math.sqrt(Math.pow((point.get(INDEX_FOUR) - point.get(0)), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(1), DEGREE)) * Math.sqrt(Math.pow(point.get(INDEX_SIX) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(INDEX_SEVEN) - point.get(INDEX_THREE), DEGREE)));
            System.out.printf("The figure area %.2f" + "\n", diag1 * diag2 * Math.sqrt(1 - Math.pow(cos, DEGREE)) / 2 );
            System.out.println(cos);
        } else if (point.size() == TWELVE) {
            double diag1 = Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_EIGHT), DEGREE));
            double diag2 = Math.sqrt(Math.pow(point.get(INDEX_THREE) - point.get(INDEX_NINE), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_TEN), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_ELEVEN), DEGREE));
            double cos =  (((point.get(INDEX_SIX) - point.get(0)) * (point.get(INDEX_NINE) - point.get(INDEX_THREE))) + ((point.get(INDEX_SEVEN) - point.get(1)) * (point.get(INDEX_TEN) - point.get(INDEX_FOUR))) + ((point.get(INDEX_EIGHT) - point.get(INDEX_TWO)) * (point.get(INDEX_ELEVEN) - point.get(INDEX_FIVE)))) / (Math.sqrt(Math.pow(point.get(INDEX_SIX) - point.get(0), DEGREE) + Math.pow(point.get(INDEX_SEVEN) - point.get(1), DEGREE) + Math.pow(point.get(INDEX_EIGHT) - point.get(INDEX_TWO), DEGREE)) * Math.sqrt(Math.pow(point.get(INDEX_NINE) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(INDEX_TEN) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_ELEVEN) - point.get(INDEX_FIVE), DEGREE)));
            System.out.printf("The figure area %.2f" + "\n", diag1 * diag2 * Math.sqrt(1 - Math.pow(cos , DEGREE)) / DEGREE);
        }
    }

    @Override
    public void calculatePerimetrFigure() {
        if (point.size() == EIGHT) {
            System.out.printf("The figure perimeter %.2f" + "\n", 2 * Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE)) + 2 * Math.sqrt(Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_THREE) - point.get(INDEX_FIVE), DEGREE)));
        } else if (point.size() == TWELVE) {
            System.out.printf("The figure perimeter %.2f" + "\n", 2 * Math.sqrt(Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE)) + 2 * Math.sqrt(Math.pow(point.get(INDEX_THREE) - point.get(INDEX_SIX), DEGREE) + Math.pow(point.get(INDEX_FOUR) - point.get(INDEX_SEVEN), DEGREE) + Math.pow(point.get(INDEX_FIVE) - point.get(INDEX_EIGHT), DEGREE)));
        }
    }
}