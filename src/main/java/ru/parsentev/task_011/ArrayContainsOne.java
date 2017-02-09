package ru.parsentev.task_011;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

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

    /**
     * Тут всё настолько просто
     * что даже комментировать нечего =)
     *
     * @return
     */
    public boolean containsOnlyOne() {
        boolean result = true;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
