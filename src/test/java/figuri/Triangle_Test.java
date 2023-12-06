package figuri;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Triangle_Test {

    @Test
    @DisplayName("Is figure invalid")
    public void isFigureInvalid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(2);
        point.add(0);
        point.add(0);
        Triangle triangle = new Triangle(point, 3);
        boolean valid = triangle.isFigureValid();
        Assertions.assertEquals(false, valid);
    }

    @Test
    @DisplayName("Is figure valid")
    public void isFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(2);
        point.add(6);
        point.add(1);
        Triangle triangle = new Triangle(point, 3);
        boolean valid = triangle.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Caclulate area Triangle")
    public void calculateArea() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);
        point.add(2);
        Triangle triangle = new Triangle(point, 3);
        double area = triangle.calculateAreaFigure();
        Assertions.assertEquals(1.9999999999999993, area);
    }

    @Test
    @DisplayName("Caclulate perimetr Triangle")
    public void calculatePerimetr() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);
        point.add(2);
        Triangle triangle = new Triangle(point, 3);
        double perimetr = triangle.calculatePerimetrFigure();
        Assertions.assertEquals(6.82842712474619, perimetr);
    }
}
