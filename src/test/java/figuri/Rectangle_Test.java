package figuri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class Rectangle_Test {
    @Test
    @DisplayName("Is figure Valid")
    public void isFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(4);
        point.add(0);
        point.add(4);
        point.add(8);
        point.add(0);
        point.add(8);
        Rectangle rectangle = new Rectangle(point, 4);
        boolean valid = rectangle.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Is figure Invalid")
    public void isIigureInvalid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(2);
        point.add(4);
        point.add(5);
        point.add(5);
        point.add(8);
        point.add(-2);
        point.add(8);
        Rectangle rectangle = new Rectangle(point, 4);
        boolean valid = rectangle.isFigureValid();
        Assertions.assertEquals(false, valid);
    }

    @Test
    @DisplayName("Calculate area Rectangle")
    public void calcalateArea() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(4);
        point.add(0);
        point.add(4);
        point.add(8);
        point.add(0);
        point.add(8);
        Rectangle rectangle = new Rectangle(point, 4);
        double valid = rectangle.calculateAreaFigure();
        Assertions.assertEquals(32, valid);
    }

    @Test
    @DisplayName("Calculate perimetr Rectangle")
    public void calculatePerimetr() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(4);
        point.add(0);
        point.add(4);
        point.add(8);
        point.add(0);
        point.add(8);
        Rectangle rectangle = new Rectangle(point, 4);
        double valid = rectangle.calculatePerimetrFigure();
        Assertions.assertEquals(24, valid);
    }
}
