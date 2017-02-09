package ru.parsentev.task_017;

import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CashMachine {
    private static final Logger log = getLogger(CashMachine.class);

    private final int[] values;

    /**
     * Конструктор сохраняет массив int [] для размена
     *
     * @param values разменные монеты
     */
    public CashMachine(final int[] values) {
        this.values = values;
    }

    /**
     * Обмениваем деньги
     *
     * @param note Сумма для размена
     * @return List of Lists с вариантами обмена
     */
    public List<List<Integer>> exchange(int note) {
        throw new UnsupportedOperationException();
    }
}
