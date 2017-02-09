package ru.parsentev.task_005;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.pow;
import static org.slf4j.LoggerFactory.getLogger;

public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    /**
     * Используем свой метод округления, иначе тесты не проходят
     * Проверка А в квадрате = Б в квадрате + С в квадрате
     *
     * @return true - прямоугольный треугольник
     */
    @Override
    public boolean exists() {
        return (this.round(pow(ab, 2)) == this.round(pow(ca, 2) + pow(bc, 2))) ||
                (this.round(pow(ca, 2)) == this.round(pow(ab, 2) + pow(bc, 2))) ||
                (this.round(pow(bc, 2)) == this.round(pow(ab, 2) + pow(ca, 2)));
    }

    /**
     * Округление до сотых в большую сторону чтобы тесты работали.
     */
    private double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}