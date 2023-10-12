package ru.ylab.nikiforov.hw01.ui;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleInputImpl implements Input{
    private Scanner userInput;

    public ConsoleInputImpl(Scanner userInput){
        this.userInput = userInput;
    }

    @Override
    public int readInt() {
        return userInput.nextInt();
    }

    @Override
    public BigDecimal readBigDecimal() {
        return userInput.nextBigDecimal();
    }
}
