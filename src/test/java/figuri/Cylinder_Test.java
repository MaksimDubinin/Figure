package figuri;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Cylinder_Test {

    @Test
    @DisplayName("Is figure valid")
    public void isFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(6);
        Cylinder cylinder = new Cylinder(point, 3);
        boolean valid = cylinder.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Calculate area Cylinder")
    public void calculateArea() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(6);
        Cylinder cylinder = new Cylinder(point, 3);
        double valid = cylinder.calculateAreaFigure();
        Assertions.assertEquals(301.59289474462014, valid);
    }
}
