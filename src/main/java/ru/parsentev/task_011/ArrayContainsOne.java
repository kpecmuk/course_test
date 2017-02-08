package ru.parsentev.task_011;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ArrayContainsOne {
    private static final Logger log = getLogger(ArrayContainsOne.class);
    private final int[] values;

    /**
     * Конструктор сохраняет массив int []
     *
     * @param values
     */
    public ArrayContainsOne(final int[] values) {
        this.values = values;
    }

    public boolean containsOnlyOne() {
        boolean result = true;
        for (int i = 0; i < this.values.length; i++) {
            if (values[i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
