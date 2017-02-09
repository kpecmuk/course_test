package ru.parsentev.task_016;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class TicTacToe {
    private static final Logger log = getLogger(TicTacToe.class);
    private final int[][] values;

    public TicTacToe(final int[][] values) {
        this.values = values;
    }

    public boolean hasWinner() {
        boolean result = false;
        for (int i = 0; i < this.values.length; i++) {
            result = checkLines(i);
            if (result) break;
        }
        return result;
    }

    private boolean checkLines(int line) {
        boolean result = false;

        if ((this.values[line][0] == this.values[line][1] && this.values[line][1] == this.values[line][2]) ||
                (this.values[0][line] == this.values[1][line] && this.values[1][line] == this.values[2][line]) ||
                (this.values[0][0] == this.values[1][1]) && (this.values[1][1] == this.values[2][2]) ||
                (this.values[2][0] == this.values[1][1]) && (this.values[1][1] == this.values[0][2])) {
            result = true;
        }
        return result;
    }
}