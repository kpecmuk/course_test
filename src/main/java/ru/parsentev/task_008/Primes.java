package ru.parsentev.task_008;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;

    public Primes(final int limit) {
        this.limit = limit;
    }

    public List<Integer> calc() {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= this.limit; i++) {
            if (doCheckPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

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