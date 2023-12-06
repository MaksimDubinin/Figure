package figuri;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Sphere_Test {

    @Test
    @DisplayName("Is figure invalid")
    public void isFigureInvalid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(2);
        point.add(2);
        point.add(2);
        point.add(2);
        point.add(2);
        point.add(2);
        Circle circle = new Circle(point, 2);
        boolean valid = circle.isFigureValid();
        Assertions.assertEquals(false, valid);
    }

    @Test
    @DisplayName("Is figure valid")
    public void isFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(2);
        point.add(2);
        Circle circle = new Circle(point, 2);
        boolean valid = circle.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Caclulate area Sphere")
    public void calculateAreaCircleXY() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);
        Sphere sphere = new Sphere(point, 2);
        double area = sphere.calculateAreaFigure();
        Assertions.assertEquals(50.26548245743669, area);
    }
}
