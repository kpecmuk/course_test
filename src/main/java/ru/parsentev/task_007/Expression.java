package ru.parsentev.task_007;

import org.slf4j.Logger;
import ru.parsentev.task_001.Calculator;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Expression {
    private static final Logger log = getLogger(Expression.class);

    private final String expr;

    /**
     * Создаем класс и сохраняем выражение
     *
     * @param expr выражение для вычисления
     */
    public Expression(final String expr) {
        this.expr = expr;
    }

    /**
     * Разбираем выражение на 3 параметра и вычисляем
     *
     * @return результат вычисления
     */
    public double calc() {
        final String[] decodeMe = this.expr.split("\\\\+|-|/|\\\\*");
        Calculator calculator = new Calculator();

        if (decodeMe.length == 3) {
            final String operation = decodeMe[1];
            double first = Double.parseDouble(decodeMe[0]);
            double second = Double.parseDouble(decodeMe[2]);
            if (operation.equals("+")) {
                calculator.add(first, second);
            } else if (operation.equals("-")) {
                calculator.substract(first, second);
            } else if (operation.equals("*")) {
                calculator.multiple(first, second);
            } else if (operation.equals("/")) {
                calculator.div(first, second);
            } else throw new UnsupportedOperationException();
        } else throw new IllegalStateException();
        return calculator.getResult();
    }
}
