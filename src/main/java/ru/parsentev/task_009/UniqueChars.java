package ru.parsentev.task_009;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;
    private int uniqueChars;
    private int lineLength;

    /**
     * Создаём класс и сохраняем строку символов
     * Вычисляем длинну строки
     * Задаем число уникальных символов равное длинне строки
     *
     * @param line строка для разбора
     */
    public UniqueChars(final String line) {
        this.line = line;
        this.uniqueChars = this.line.length();
        this.lineLength = this.line.length();
    }

    /**
     * Перебором вычисляем уникальные символы
     * Изначально считаем что все символы уникальны
     * Если находим, то уменьшаем значение uniqueChars
     *
     * @return число уникальных символов в строке
     */
    public int unique() {
        char[] charArray = line.toCharArray();
        for (int i = 0; i < this.lineLength - 1; i++) {
            for (int j = i + 1; j < this.lineLength; j++) {
                if (charArray[i] == charArray[j]) {
                    uniqueChars--;
                }
            }
        }
        return uniqueChars;
    }
}