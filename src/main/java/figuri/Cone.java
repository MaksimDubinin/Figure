package figuri;

import java.util.ArrayList;

public class Cone extends Figure {

    private ArrayList<Integer> Point;
    private int count;

    public Cone(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (Point.size() == NINE && count == 3) {
            int vecx1 = Point.get(INDEX_THREE) - Point.get(0);
            int vecy1 = Point.get(INDEX_FOUR) - Point.get(1);
            int vecz1 = Point.get(INDEX_FIVE) - Point.get(INDEX_TWO);

            int vecx2 = Point.get(INDEX_SIX) - Point.get(0);
            int vecy2 = Point.get(INDEX_SEVEN) - Point.get(1);
            int vecz2 = Point.get(INDEX_EIGHT) - Point.get(INDEX_TWO);

            if ((vecx1 * vecx2 + vecy1 * vecy2 + vecz1 * vecz2) / (Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecy1, DEGREE) * Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecy2, DEGREE) ))) == 0) {
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

        int vecx3 = Point.get(INDEX_THREE) - Point.get(INDEX_SIX);
        int vecy3 = Point.get(INDEX_FOUR) - Point.get(INDEX_SEVEN);
        int vecz3 = Point.get(INDEX_FIVE) - Point.get(INDEX_EIGHT);

        double radius = Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE));
        double h = Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecz2, DEGREE));
        double l = Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE));
        double area = Math.PI * radius * (radius + l);
        System.out.printf("%.2f", area);
    }

    @Override
    public void perimetrFigure() {
        System.out.println("The CONE has no perimeter");
    }
}
