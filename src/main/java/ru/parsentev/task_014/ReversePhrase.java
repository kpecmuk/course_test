package ru.parsentev.task_014;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class ReversePhrase {
    private static final Logger log = getLogger(ReversePhrase.class);
    private final String line;

    public ReversePhrase(final String line) {
        this.line = line;
    }

    public String reverse() {
        String result = new String();
        String[] splitedLine = this.line.split(" ");
        if (splitedLine.length == 1) {
            result = this.line;
        } else {
            for (int i = splitedLine.length - 1; i > 0; i--) {
                result += splitedLine[i] + " ";
            }
            result += splitedLine[0];
        }
        return result;
    }
}