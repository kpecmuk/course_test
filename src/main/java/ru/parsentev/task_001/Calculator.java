package ru.parsentev.task_001;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);
    private double result;

    /**
     * получение результата вычисления
     *
     * @return результат
     */
    public double getResult() {
        return result;
    }

    /**
     * Сложение
     *
     * @param first  слогаемое
     * @param second слогаемое
     */
    public void add(double first, double second) {
        result = first + second;
    }

    /**
     * Вычитание
     */
    public void substract(double first, double second) {
        result = first - second;
    }

    /**
     * Умножение
     */
    public void multiple(double first, double second) {
        result = first * second;
    }

    /**
     * Деление
     */
    public void div(double first, double second) {
        if (second == 0) throw new java.lang.IllegalStateException();
        result = first / second;
    }

    /**
     * Возведение в степень
     */
    public void expand(double first, double second) {
        result = first;
        for (int i = 0; i < second; i++) {
            result *= first;
        }
    }
}
