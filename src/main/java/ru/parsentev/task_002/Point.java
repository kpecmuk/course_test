package ru.parsentev.task_002;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Point {
    private static final Logger log = getLogger(Point.class);

    private final int x;
    private final int y;

    /**
     * Конструктор.
     * Сохраняем координаты точки
     *
     * @param x координата
     * @param y координата
     */
    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Вычисляем дистанцию между двумя точками
     * перкая точка это this, вторая та что передана
     *
     * @param point вторая точка
     * @return расстояние
     */
    public double distanceTo(final Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
}
