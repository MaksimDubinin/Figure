package figuri;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Cone_Test {

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
        Cone cone = new Cone(point, 3);
        boolean valid = cone.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Is figure invalid")
    public void isFigureInvalid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);
        point.add(5);
        point.add(6);
        Cone cone = new Cone(point, 3);
        boolean valid = cone.isFigureValid();
        Assertions.assertEquals(false, valid);
    }

    @Test
    @DisplayName("Calculate area Cone")
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
        Cone cone = new Cone(point, 3);
        double valid = cone.calculateAreaFigure();
        Assertions.assertEquals(52.304723677543585, valid);
    }
}
