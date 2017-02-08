package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

    private final int[] values;

    /**
     * Сохраняем массив int [] через конструктор
     *
     * @param values
     */
    public SequenceArray(final int[] values) {
        this.values = values;
    }

    /**
     * Определяем есть ли в массиве три единицы подряд
     *
     * @return true если найдены 3 единицы
     */
    public boolean containsOneSequence() {
        boolean result = false;
        for (int i = 0; i < this.values.length - 2; i++) {
            if ((this.values[i] == 1)
                    && (this.values[i + 1] == 1)
                    && (this.values[i + 2] == 1)) {
                result = true;
                break;
            }
        }
        return result;
    }
}