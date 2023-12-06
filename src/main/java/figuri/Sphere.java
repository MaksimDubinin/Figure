package figuri;

import java.util.ArrayList;

public class Sphere extends Figure {

    private ArrayList<Integer> point;
    private int count;

    public Sphere(ArrayList<Integer> point, int count) {
        this.point = point;
        this.count = count;
    }
    @Override
    public boolean isFigureValid() {
        return count == 2 && point.size() == SIX && (!point.get(0).equals(point.get(INDEX_THREE)) || !point.get(1).equals(point.get(INDEX_FOUR)) || !point.get(INDEX_TWO).equals(point.get(INDEX_FIVE)));
    }

    @Override
    public double calculateAreaFigure() {
        System.out.printf("The figure area %.2f" + "\n", Math.PI * FOUR * (Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE)));
        return Math.PI * FOUR * (Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE));
    }
}
