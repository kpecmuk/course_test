package ru.parsentev.task_008;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;

    /**
     * Конструктор создаёт класс и сохраняет значение ограничения
     *
     * @param limit максимальное ограничение до которого будем вычислять
     *              простые числа
     */
    public Primes(final int limit) {
        this.limit = limit;
    }

    /**
     * делаем выборку из числе от 1 до limit
     * далее отправляем число в doCheckPrime()
     *
     * @return список простых чисел от 1 до limit (List <Integer>)
     */
    public List<Integer> calc() {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= this.limit; i++) {
            if (doCheckPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * Проверяются делители в границах от 2 до N - 1
     * если найден хоть один - значит число не простое
     *
     * @param val число для проверки
     * @return true если число простое
     */
    private boolean doCheckPrime(int val) {
        boolean result = true;
        for (int j = 2; j < val; j++) {
            if (val % j == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}