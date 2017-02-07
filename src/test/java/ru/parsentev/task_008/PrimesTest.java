package ru.parsentev.task_008;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class PrimesTest {
    @Test
    public void calc() {
        Primes primes = new Primes(60);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59)));
    }
}