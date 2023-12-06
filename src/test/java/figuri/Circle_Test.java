package figuri;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Circle_Test {

    @Test
    @DisplayName("Is figure invalid")
    public void isFigureValidXY() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        Circle circle = new Circle(point, 2);
        boolean valid = circle.isFigureValid();
        Assertions.assertEquals(false, valid);
    }

    @Test
    @DisplayName("Is figure valid")
    public void isFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(1);
        point.add(2);
        point.add(3);
        point.add(1);
        point.add(5);
        point.add(8);
        Circle circle = new Circle(point, 2);
        boolean valid = circle.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Caclulate area Circle")
    public void calculateAreaCircle() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        Circle circle = new Circle(point, 2);
        double area = circle.calculateAreaFigure();
        Assertions.assertEquals(12.566370614359172, area);
    }

    @Test
    @DisplayName("Caclulate area Circle")
    public void calculateAreaCircle2() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(2);
        Circle circle = new Circle(point, 6);
        double area = circle.calculateAreaFigure();

        Assertions.assertEquals(12.566370614359172, area);
    }

    @Test
    @DisplayName("Caclulate perimetr Circle")
    public void calculatePerimetrCircle1() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(0);
        Circle circle = new Circle(point, 4);
        double perimetr = circle.calculatePerimetrFigure();

        Assertions.assertEquals(18.84955592153876, perimetr);
    }

    @Test
    @DisplayName("Caclulate perimetr Circle")
    public void calculatePerimetrCircle2() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(4);
        point.add(0);
        point.add(0);
        point.add(0);
        Circle circle = new Circle(point, 4);
        double perimetr = circle.calculatePerimetrFigure();
        Assertions.assertEquals(25.132741228718345, perimetr);
    }
}