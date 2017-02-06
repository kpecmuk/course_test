package ru.parsentev.task_003;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import static org.slf4j.LoggerFactory.getLogger;

public class Triangle {
    private static final Logger log = getLogger(Triangle.class);
    protected double ab, bc, ca;

    /**
     * Вычисляем расстояния между точками
     * и сохраняем результат
     *
     * @param first  координаты первой точки
     * @param second координаты второй точки
     * @param third  координаты третьей точки
     */
    public Triangle(final Point first, final Point second, final Point third) {
        this.ab = first.distanceTo(second);
        this.bc = second.distanceTo(third);
        this.ca = third.distanceTo(first);
    }

    /**
     * Существование треугольника
     * Если сумма длинн двух сторон не превышает длинну третьей
     *
     * @return true если треугольник существует
     */
    public boolean exists() {
        return (ab < bc + ca) && (bc < ca + ab) && (ca < ab + bc);
    }

    /**
     * Формула Герона
     * Вычисляем площадь треугольника
     *
     * @return округленное значение площади
     */
    public double area() {
        if (this.exists()) {
            double p = (this.ab + this.bc + this.ca) / 2;
            return round(sqrt(p * (p - this.ab) * (p - this.bc) * (p - this.ca)));
        } else {
            throw new IllegalStateException("Triangle does not exists");
        }
    }
}