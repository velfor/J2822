package ru.ylab.nikiforov.hw01.ui;

public class ConsoleOutputImpl implements Output{
    @Override
    public void writeString(String message) {
        System.out.println(message);
    }
}
