package figuri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Polygon_Test {

    @Test
    @DisplayName("Is figure invalid")
    public void isFigureInvalid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(5);
        point.add(2);
        Polygon polygon = new Polygon(point, 3);
        boolean valid = polygon.isFigureValid();
        Assertions.assertEquals(false, valid);
    }

    @Test
    @DisplayName("Is figure valid")
    public void isFigureValid2() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(6);
        point.add(5);
        point.add(2);
        point.add(29);
        point.add(10);
        Polygon polygon = new Polygon(point, 4);
        boolean valid = polygon.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Caclulate area Polygon")
    public void calculateAreaPolygon() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(0);
        point.add(0);
        point.add(1);
        Polygon polygon = new Polygon(point, 3);
        double area = polygon.calculateAreaFigure();
        Assertions.assertEquals(0.5, area);
    }

    @Test
    @DisplayName("Caclulate perimetr Polygon")
    public void calculatePerimetrPolygon() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(0);
        point.add(0);
        point.add(1);
        Polygon polygon = new Polygon(point, 3);
        double area = polygon.calculatePerimetrFigure();
        Assertions.assertEquals(3.414213562373095, area);
    }
}
