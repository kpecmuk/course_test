package ru.parsentev.task_006;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

public class Square {
    private static final Logger log = getLogger(Square.class);

    protected double distance1, distance2, distance3, distance4;

    /**
     * Вычисляем расстояния между точками
     *
     * @param first  координаты первой точки
     * @param second координаты второй точки
     * @param third  координаты третьей точки
     * @param fourth координаты четвертой точки
     */
    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.distance1 = first.distanceTo(second);
        this.distance2 = second.distanceTo(third);
        this.distance3 = third.distanceTo(fourth);
        this.distance4 = fourth.distanceTo(first);
    }

    /**
     * проверяем два расстояния между любыми двумя точками
     * линии будут либо параллельно одинаковые либо по перекрестию
     * оба варианта проходят тест
     */
    public boolean exists() {
        return ((this.distance1 == this.distance3) && (this.distance2 == this.distance4));
    }
}
