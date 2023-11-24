package figuri;

import java.util.ArrayList;

public class Polygon extends Figure {

    private ArrayList<Integer> Point;
    private int count;
    public Polygon(ArrayList<Integer> Point, int count) {
        this.Point = Point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        int k = 0;
        if (Point.size() % 2 == 0 && Point.size() > FIVE) {
            for (int i = 0; i < Point.size() / 2; i += 2) {
                if (Point.get(i) != Point.get(i + 2) || Point.get(i + 1) != Point.get(i + THREE)) {
                    k += 1;
                }
            }
            if (k >= 2) {
                return true;
            } else {
                return false;
            }
        } else if (Point.size() % THREE == 0 && Point.size() > EIGHT) {
            for (int i = 0; i < Point.size() / 3; i += THREE) {
                if (Point.get(i) != Point.get(i + THREE) || Point.get(i + 1) != Point.get(i + FOUR) || Point.get(i + DEGREE) != Point.get(i + FIVE)) {
                    k += 1;
                }
            }
            if (k >= DEGREE) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void areaFigure() {
        if (Point.size() % 2 == 0) {
            double sum = 0;
            for (int i = 0; i < count - 1; ++i) {
                sum += (Point.get(2 * i) * Point.get(2 * i + THREE) - Point.get(2 * i + 2) * Point.get(2 * i + 1));
            }
            double res = 0.5 * Math.abs(sum + Point.get(Point.size() - 2) * Point.get(1) - Point.get(0) * Point.get(Point.size() - 1));
            System.out.printf("%.2f", res);
        }
    }

    @Override
    public void perimetrFigure() {
        double area = 0;
        for (int i = 0; i < Point.size() - 2; i += DEGREE) {
            double side = Math.sqrt(Math.pow(Point.get(i) - Point.get(i + DEGREE), DEGREE) + Math.pow(Point.get(i + 1) - Point.get(i + THREE), DEGREE));
            area += side;
        }
        area += Math.sqrt(Math.pow(Point.get(0) - Point.get(Point.size() - DEGREE), DEGREE) + Math.pow(Point.get(1) - Point.get(Point.size() - 1), DEGREE));
        System.out.printf("%.2f", area);
    }
}