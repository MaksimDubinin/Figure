package figuri;

import java.util.ArrayList;

public class Cylinder extends Figure {

    private ArrayList<Integer> point;
    private int count;
    public Cylinder(ArrayList<Integer> point, int count) {
        this.point = point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (point.size() == NINE && count == THREE) {
            double vecx1 = point.get(0) - point.get(INDEX_SIX);
            double vecx2 = point.get(INDEX_THREE) - point.get(INDEX_SIX);
            double vecx3 = point.get(INDEX_THREE) - point.get(0);

            double vecy1 = point.get(1) - point.get(INDEX_SEVEN);
            double vecy2 = point.get(INDEX_FOUR) - point.get(INDEX_SEVEN);
            double vecy3 = point.get(INDEX_FOUR) - point.get(1);

            double vecz1 = point.get(INDEX_TWO) - point.get(INDEX_EIGHT);
            double vecz2 = point.get(INDEX_FIVE) - point.get(INDEX_EIGHT);
            double vecz3 = point.get(INDEX_FIVE) - point.get(INDEX_TWO);

            return (vecx1 * vecx3 + vecy1 * vecy3 + vecz1 * vecz3) / (Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE)) * Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE))) == 0 || ((vecx2 * vecx3 + vecy2 * vecy3 + vecz2 * vecz3) / (Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE)) * Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE)))) == 0;
        }
        return false;
    }

    @Override
    public double calculateAreaFigure() {
        double vecx1 = point.get(0) - point.get(INDEX_SIX);
        double vecx2 = point.get(INDEX_THREE) - point.get(INDEX_SIX);
        double vecx3 = point.get(INDEX_THREE) - point.get(0);

        double vecy1 = point.get(1) - point.get(INDEX_SEVEN);
        double vecy2 = point.get(INDEX_FOUR) - point.get(INDEX_SEVEN);
        double vecy3 = point.get(INDEX_FOUR) - point.get(1);

        double vecz1 = point.get(INDEX_TWO) - point.get(INDEX_EIGHT);
        double vecz2 = point.get(INDEX_FIVE) - point.get(INDEX_EIGHT);
        double vecz3 = point.get(INDEX_FIVE) - point.get(INDEX_TWO);
        if ((vecx1 * vecx3 + vecy1 * vecy3 + vecz1 * vecz3) / (Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE)) * Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE))) == 0) {
            double area = 2 * Math.PI * Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE)) * (Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE)) + Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE)));
            System.out.printf("The figure area %.2f" + "\n", area);
            return area;
        } else if (((vecx2 * vecx3 + vecy2 * vecy3 + vecz2 * vecz3) / (Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE)) * Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE)))) == 0) {
            double area = 2 * Math.PI * Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE)) * (Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE)) + Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE)));
            System.out.printf("The figure area %.2f" + "\n", area);
            return area;
        }
        return -1;
    }
}
