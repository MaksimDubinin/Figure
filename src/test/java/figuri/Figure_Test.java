package figuri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Figure_Test {

    @Test
    @DisplayName("Is figure valid coordinate")
    public void isFigureInvalid() {
        Figure figure = new Figure();
        boolean valid = figure.isFigureValid();
        Assertions.assertEquals(true, valid);
    }

    @Test
    @DisplayName("Calculate area Figure")
    public void calculateArea() {
        Figure figure = new Figure();
        double area = figure.calculateAreaFigure();
        Assertions.assertEquals(-1, area);
    }

    @Test
    @DisplayName("Calculate perimatr Figure")
    public void calculatePerimetr() {
        Figure figure = new Figure();
        double area = figure.calculatePerimetrFigure();
        Assertions.assertEquals(-1, area);
    }
}
