package figuri;

import java.util.ArrayList;

public class Polygon extends Figure {

    private ArrayList<Integer> point;
    private int count;
    public Polygon(ArrayList<Integer> point, int count) {
        this.point = point;
        this.count = count;
    }

    @Override
    public boolean isFigureValid() {
        int k = 0;
        if (point.size() % 2 == 0 && point.size() > FIVE) {
            for (int i = 0; i < point.size() / 2; i += 2) {
                if (!point.get(i).equals(point.get(i + 2)) || !point.get(i + 1).equals(point.get(i + THREE))) {
                    k += 1;
                }
            }
            return k >= 2;
        } else if (point.size() % THREE == 0 && point.size() > EIGHT) {
            for (int i = 0; i < point.size() / 3; i += THREE) {
                if (!point.get(i).equals(point.get(i + THREE)) || !point.get(i + 1).equals(point.get(i + FOUR)) || !point.get(i + DEGREE).equals(point.get(i + FIVE))) {
                    k += 1;
                }
            }
            return k >= 2;
        }
        return false;
    }

    @Override
    public double calculateAreaFigure() {
        if (point.size() % 2 == 0) {
            double sum = 0;
            for (int i = 0; i < count - 1; ++i) {
                sum += (point.get(2 * i) * point.get(2 * i + THREE) - point.get(2 * i + 2) * point.get(2 * i + 1));
            }
            double res = 0.5 * Math.abs(sum + point.get(point.size() - 2) * point.get(1) - point.get(0) * point.get(point.size() - 1));
            System.out.printf("The figure area %.2f" + "\n", res);
            return res;
        }
        return -1;
    }

    @Override
    public double calculatePerimetrFigure() {
        double area = 0;
        for (int i = 0; i < point.size() - 2; i += DEGREE) {
            double side = Math.sqrt(Math.pow(point.get(i) - point.get(i + DEGREE), DEGREE) + Math.pow(point.get(i + 1) - point.get(i + THREE), DEGREE));
            area += side;
        }
        area += Math.sqrt(Math.pow(point.get(0) - point.get(point.size() - DEGREE), DEGREE) + Math.pow(point.get(1) - point.get(point.size() - 1), DEGREE));
        System.out.printf("The figure perimeter %.2f" + "\n", area);
        return area;
    }
}