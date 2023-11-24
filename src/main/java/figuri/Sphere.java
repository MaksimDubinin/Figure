package figuri;

import java.util.ArrayList;

public class Sphere extends Figure {

    private ArrayList<Integer> Point;
    private int count;

    public Sphere(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }
    @Override
    public boolean isFigureValid() {
        if (count == 2 && Point.size() == SIX && (Point.get(0) != Point.get(INDEX_THREE) || Point.get(1) != Point.get(INDEX_FOUR) || Point.get(INDEX_TWO) != Point.get(INDEX_FIVE))) {
            return true;
        }
        return false;
    }

    @Override
    public void areaFigure() {
        System.out.printf("%.2f", Math.PI * FOUR * (Math.pow(Point.get(0) - Point.get(INDEX_THREE), DEGREE) + Math.pow(Point.get(1) - Point.get(INDEX_FOUR), DEGREE) + Math.pow(Point.get(INDEX_TWO) - Point.get(INDEX_FIVE), DEGREE)));
    }

    @Override
    public void perimetrFigure() {
        System.out.print("Sphere has no perimetr.");
    }
}
