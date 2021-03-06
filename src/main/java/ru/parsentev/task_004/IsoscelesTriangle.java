package ru.parsentev.task_004;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import static org.slf4j.LoggerFactory.getLogger;

public class IsoscelesTriangle extends Triangle {
    private static final Logger log = getLogger(IsoscelesTriangle.class);

    public IsoscelesTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    /**
     * Равнобедренный треугольник это где
     * две стороны равны
     *
     * @return true если треугольник равнобедренный
     */
    @Override
    public boolean exists() {
        return super.exists() &&
                (this.ab == this.bc) ||
                (this.bc == this.ca) ||
                (this.ca == this.ab);

    }
}
