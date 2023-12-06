package figuri;

import java.util.ArrayList;

public class Cone extends Figure {

    private ArrayList<Integer> point;
    private int count;

    public Cone(ArrayList<Integer> point, int count) {
        this.point = point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        if (point.size() == NINE && count == 3) {
            int vecx1 = point.get(INDEX_THREE) - point.get(0);
            int vecy1 = point.get(INDEX_FOUR) - point.get(1);
            int vecz1 = point.get(INDEX_FIVE) - point.get(INDEX_TWO);

            int vecx2 = point.get(INDEX_SIX) - point.get(0);
            int vecy2 = point.get(INDEX_SEVEN) - point.get(1);
            int vecz2 = point.get(INDEX_EIGHT) - point.get(INDEX_TWO);

            return (vecx1 * vecx2 + vecy1 * vecy2 + vecz1 * vecz2) / (Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecy1, DEGREE) * Math.sqrt(Math.pow(vecx2, DEGREE) + Math.pow(vecy2, DEGREE) + Math.pow(vecy2, DEGREE) ))) == 0;
        }
        return false;
    }

    @Override
    public double calculateAreaFigure() {
        int vecx1 = point.get(INDEX_THREE) - point.get(0);
        int vecy1 = point.get(INDEX_FOUR) - point.get(1);
        int vecz1 = point.get(INDEX_FIVE) - point.get(INDEX_TWO);

        int vecx3 = point.get(INDEX_THREE) - point.get(INDEX_SIX);
        int vecy3 = point.get(INDEX_FOUR) - point.get(INDEX_SEVEN);
        int vecz3 = point.get(INDEX_FIVE) - point.get(INDEX_EIGHT);

        double radius = Math.sqrt(Math.pow(vecx1, DEGREE) + Math.pow(vecy1, DEGREE) + Math.pow(vecz1, DEGREE));
        double l = Math.sqrt(Math.pow(vecx3, DEGREE) + Math.pow(vecy3, DEGREE) + Math.pow(vecz3, DEGREE));
        double area = Math.PI * radius * (radius + l);
        System.out.printf("The figure area %.2f" + "\n", area);
        return area;
    }
}
