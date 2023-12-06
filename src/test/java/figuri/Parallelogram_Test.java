package figuri;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Parallelogram_Test {

    @Test
    @DisplayName("Is figure valid")
    public void isFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(1);
        point.add(3);
        point.add(1);
        point.add(2);
        point.add(0);

        Parallelogram parallelogram = new Parallelogram(point, 4);
        boolean valid = parallelogram.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Calculate area Parallelogram")
    public void calculateArea1() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(1);
        point.add(3);
        point.add(1);
        point.add(2);
        point.add(0);

        Parallelogram parallelogram = new Parallelogram(point, 4);
        double valid = parallelogram.calculateAreaFigure();
        Assertions.assertEquals(2, valid);
    }

    @Test
    @DisplayName("Calculate perinetr Parallelogram")
    public void calculatePerimetr1() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(1);
        point.add(3);
        point.add(1);
        point.add(2);
        point.add(0);

        Parallelogram parallelogram = new Parallelogram(point, 4);
        double valid = parallelogram.calculatePerimetrFigure();
        Assertions.assertEquals(6.82842712474619, valid);
    }

    @Test
    @DisplayName("Is figure valid")
    public void isFigureValid2() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(1);
        point.add(0);
        point.add(3);
        point.add(1);
        point.add(0);
        point.add(2);
        point.add(0);
        point.add(0);

        Parallelogram parallelogram = new Parallelogram(point, 4);
        boolean valid = parallelogram.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Calculate area Parallelogram")
    public void calculateArea2() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(1);
        point.add(3);
        point.add(1);
        point.add(2);
        point.add(0);

        Parallelogram parallelogram = new Parallelogram(point, 4);
        double valid = parallelogram.calculateAreaFigure();
        Assertions.assertEquals(2, valid);
    }

    @Test
    @DisplayName("Calculate perinetr Parallelogram")
    public void calculatePerimetr2() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(1);
        point.add(3);
        point.add(1);
        point.add(2);
        point.add(0);

        Parallelogram parallelogram = new Parallelogram(point, 4);
        double valid = parallelogram.calculatePerimetrFigure();
        Assertions.assertEquals(6.82842712474619, valid);
    }
}
