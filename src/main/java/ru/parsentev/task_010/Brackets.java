package ru.parsentev.task_010;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Brackets {
    private static final Logger log = getLogger(Brackets.class);
    private final String line;
    private int lineLength;

    /**
     * Конструктор. Сохраняем строку и длинну
     *
     * @param line строка для проверки
     */
    public Brackets(final String line) {
        this.line = line;
        this.lineLength = line.length();
    }

    /**
     * Посчитаем длинну строки и количество
     * открытых и закрытых скобок
     *
     * @return true если ОК
     */
    public boolean isCorrect() {
        boolean result = true;
        int opened = 0, closed = 0;
        char[] charArray = this.line.toCharArray();

        if (lineLength % 2 != 0) {
            result = false;
        }
        if (result) {
            for (int i = 0; i < this.lineLength; i++) {
                if (charArray[i] == '(') opened++;
                if (charArray[i] == ')') closed++;
            }
            if (opened != closed) result = false;
        }
        return result;
    }
}