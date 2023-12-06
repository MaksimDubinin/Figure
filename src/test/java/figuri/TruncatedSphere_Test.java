package figuri;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TruncatedSphere_Test {
    @Test
    @DisplayName("Is figure Invalid")
    public void isFigureInvalid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(2);
        point.add(2);
        point.add(2);
        point.add(7);
        point.add(0);
        TruncatedSphere truncatedSphere = new TruncatedSphere(point, 3);
        boolean valid = truncatedSphere.isFigureValid();
        Assertions.assertEquals(false, valid);
    }

    @Test
    @DisplayName("Is figure Valid")
    public void isFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(1);
        point.add(1);
        point.add(1);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);
        TruncatedSphere truncatedSphere = new TruncatedSphere(point, 3);
        boolean valid = truncatedSphere.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Calculate area Truncated Sphere")
    public void calculateArea() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(1);
        point.add(1);
        point.add(1);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);
        TruncatedSphere truncatedSphere = new TruncatedSphere(point, 3);
        double area = truncatedSphere.calculateAreaFigure();
        Assertions.assertEquals(36.01553741412364, area);
    }
}
