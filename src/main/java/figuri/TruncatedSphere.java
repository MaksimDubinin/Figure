package figuri;

import java.util.ArrayList;

public class TruncatedSphere extends Figure {

    private ArrayList<Integer> point;
    private int count;
    public TruncatedSphere(ArrayList<Integer> point, int count) {
        this.point = point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (point.size() == NINE && count == THREE) {
            int vecx1 = point.get(INDEX_THREE) - point.get(0);
            int vecy1 = point.get(INDEX_FOUR) - point.get(1);
            int vecz1 = point.get(INDEX_FIVE) - point.get(INDEX_TWO);

            int vecx2 = point.get(INDEX_SIX) - point.get(0);
            int vecy2 = point.get(INDEX_SEVEN) - point.get(1);
            int vecz2 = point.get(INDEX_EIGHT) - point.get(INDEX_TWO);

            double radius = Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE));
            double height = Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE));

            return radius == height && radius > 0;
        }
        return false;
    }

    @Override
    public void calculateAreaFigure() {
        int vecx1 = point.get(INDEX_THREE) - point.get(0);
        int vecy1 = point.get(INDEX_FOUR) - point.get(1);
        int vecz1 = point.get(INDEX_FIVE) - point.get(INDEX_TWO);

        double radius = Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE));

        double h0 = Math.abs(point.get(INDEX_TWO) - point.get(INDEX_EIGHT));
        double h1 = radius - h0;

        double s1 = 2 * Math.PI * h1 * radius;
        double s2 = FOUR * Math.PI * Math.pow(radius, DEGREE);
        double s3 = Math.PI * (Math.pow(radius, DEGREE) - Math.pow(h0, DEGREE));

        double s0 = s2 - s1 + s3;
        System.out.printf("The figure area %.2f" + "\n", s0);
    }
}