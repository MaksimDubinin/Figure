package figuri;

import java.util.ArrayList;

public class Truncated_sphere extends Figure {

    private ArrayList<Integer> Point;
    private int count;
    public Truncated_sphere(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (Point.size() == NINE && count == THREE) {
            int vecx1 = Point.get(INDEX_THREE) - Point.get(0);
            int vecy1 = Point.get(INDEX_FOUR) - Point.get(1);
            int vecz1 = Point.get(INDEX_FIVE) - Point.get(INDEX_TWO);

            int vecx2 = Point.get(INDEX_SIX) - Point.get(0);
            int vecy2 = Point.get(INDEX_SEVEN) - Point.get(1);
            int vecz2 = Point.get(INDEX_EIGHT) - Point.get(INDEX_TWO);

            double radius = Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE));
            double height = Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE));

            if (radius == height && radius > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void areaFigure() {
        int vecx1 = Point.get(INDEX_THREE) - Point.get(0);
        int vecy1 = Point.get(INDEX_FOUR) - Point.get(1);
        int vecz1 = Point.get(INDEX_FIVE) - Point.get(INDEX_TWO);

        int vecx2 = Point.get(INDEX_SIX) - Point.get(0);
        int vecy2 = Point.get(INDEX_SEVEN) - Point.get(1);
        int vecz2 = Point.get(INDEX_EIGHT) - Point.get(INDEX_TWO);

        double radius = Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE));

        double h0 = Math.abs(Point.get(INDEX_TWO) - Point.get(INDEX_EIGHT));
        double h1 = radius - h0;

        double s1 = 2 * Math.PI * h1 * radius;
        double s2 = FOUR * Math.PI * Math.pow(radius, DEGREE);
        double s3 = Math.PI * (Math.pow(radius, DEGREE) - Math.pow(h0, DEGREE));

        double s0 = s2 - s1 + s3;
        System.out.printf("%.2f", s0);
    }

    @Override
    public void perimetrFigure() {
        System.out.print("The Truncated_sphere has no perimetr.");
    }
}