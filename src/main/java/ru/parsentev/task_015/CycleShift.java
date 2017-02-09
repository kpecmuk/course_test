package ru.parsentev.task_015;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class CycleShift {
    private static final Logger log = getLogger(CycleShift.class);

    private final int[] values;
    private final int arraySize;

    /**
     * Конструктор сохраняет массив и вычисляет его длинну
     *
     * @param values    массив
     * @param arraySize длинна массива
     */
    public CycleShift(final int[] values, int arraySize) {
        this.values = values;
        this.arraySize = values.length;
    }

    /**
     * Будем копировать массив, встроенными средствами
     * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
     * Шифтуем только если длинна массива позволяет
     *
     * @param position величина смещения
     * @return массив int []
     */
    public int[] shift(int position) {
        if (this.arraySize > 1) {
            int tempValue;
            for (int i = 0; i < position; i++) {
                tempValue = this.values[this.arraySize - 1];
                System.arraycopy(this.values, 0, this.values, 1, this.arraySize - 1);
                this.values[0] = tempValue;
            }
        }
        return this.values;
    }
}