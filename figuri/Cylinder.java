package figuri;

import java.util.ArrayList;

public class Cylinder extends Figure {

    private ArrayList<Integer> Point;
    private int count;
    public Cylinder(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (Point.size() == NINE && count == THREE) {
            double vecx1 = Point.get(0) - Point.get(INDEX_SIX);
            double vecx2 = Point.get(INDEX_THREE) - Point.get(INDEX_SIX);
            double vecx3 = Point.get(INDEX_THREE) - Point.get(0);

            double vecy1 = Point.get(1) - Point.get(INDEX_SEVEN);
            double vecy2 = Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN);
            double vecy3 = Point.get(INDEX_FOUR) - Point.get(1);

            double vecz1 = Point.get(INDEX_TWO) - Point.get(INDEX_EIGHT);
            double vecz2 = Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT);
            double vecz3 = Point.get(INDEX_FIVE) - Point.get(INDEX_TWO);
            if ((vecx1 * vecx3 + vecy1 * vecy3 + vecz1 * vecz3) / (Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE)) * Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE))) == 0 || ((vecx2 * vecx3 + vecy2 * vecy3 + vecz2 * vecz3) / (Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE)) * Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE)))) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void areaFigure() {
        double vecx1 = Point.get(0) - Point.get(INDEX_SIX);
        double vecx2 = Point.get(INDEX_THREE) - Point.get(INDEX_SIX);
        double vecx3 = Point.get(INDEX_THREE) - Point.get(0);

        double vecy1 = Point.get(1) - Point.get(INDEX_SEVEN);
        double vecy2 = Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN);
        double vecy3 = Point.get(INDEX_FOUR) - Point.get(1);

        double vecz1 = Point.get(INDEX_TWO) - Point.get(INDEX_EIGHT);
        double vecz2 = Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT);
        double vecz3 = Point.get(INDEX_FIVE) - Point.get(INDEX_TWO);
        if ((vecx1 * vecx3 + vecy1 * vecy3 + vecz1 * vecz3) / (Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE)) * Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE))) == 0) {
            double area = 2 * Math.PI * Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE)) * (Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE)) + Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE)));
            System.out.printf("%.2f", area);
        } else if (((vecx2 * vecx3 + vecy2 * vecy3 + vecz2 * vecz3) / (Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE)) * Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE)))) == 0) {
            double area = 2 * Math.PI * Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE)) * (Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE)) + Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE)));
            System.out.printf("%.2f", area);
        }
    }

    @Override
    public void perimetrFigure() {
        System.out.println("The CYLINDER has no perimeter");
    }
}
