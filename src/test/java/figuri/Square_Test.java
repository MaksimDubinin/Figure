package figuri;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Square_Test {
    @Test
    @DisplayName("Is figure invalid")
    public void isFigureInvalid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(2);
        point.add(2);
        point.add(0);
        point.add(4);
        Square square = new Square(point, 4);
        boolean valid = square.isFigureValid();
        Assertions.assertEquals(false, valid);
    }

    @Test
    @DisplayName("Is figure Valid")
    public void isFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(2);
        point.add(2);
        point.add(0);
        point.add(2);
        Square square = new Square(point, 4);
        boolean valid = square.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Calculate area Square")
    public void calculateArea() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(2);
        point.add(2);
        point.add(0);
        point.add(2);
        Square square = new Square(point, 4);
        double area = square.calculateAreaFigure();
        Assertions.assertEquals(4, area);
    }

    @Test
    @DisplayName("Calculate perimetr Square")
    public void calculatePerimetr() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(2);
        point.add(2);
        point.add(0);
        point.add(2);
        Square square = new Square(point, 4);
        double area = square.calculatePerimetrFigure();
        Assertions.assertEquals(8, area);
    }
}
