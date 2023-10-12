package ru.ylab.nikiforov.hw01.ui;

import ru.ylab.nikiforov.hw01.service.TransactionService;

public class MainMenu {
    private static final int VIEW_BALANCE = 1;
    private static final int  ADD_FUNDS_TO_ACCOUNT = 2;
    private static final int  REMOVE_FUNDS_FROM_ACCOUNT = 3;
    private static final int  EXIT_APP = 4;
    private TransactionService transactionService;
    private Input inputReader;
    private Output outputWriter;

    public MainMenu(TransactionService transactionService, Input inputReader, Output outputWriter) {
        this.transactionService = transactionService;
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
    }

    public void printChoices(){
        outputWriter.writeString("Меню:");
        outputWriter.writeString("1. Посмотреть баланс");
        outputWriter.writeString("2. Положить деньги на счет");
        outputWriter.writeString("3. Снять деньги со счета");
        outputWriter.writeString("4. Выход");
        outputWriter.writeString("Выберите пункт меню: ");
    }

    public void showMenu() {
        int choice;

        do {
            this.printChoices();

            choice = inputReader.readInt();

            switch (choice) {
                case VIEW_BALANCE:
                    // вызов метода для просмотра баланса
                    break;
                case ADD_FUNDS_TO_ACCOUNT:
                    // вызов метода для пополнения счета
                    break;
                case REMOVE_FUNDS_FROM_ACCOUNT:
                    // вызов метода для снятия денег со счета
                    break;
                case EXIT_APP:
                    outputWriter.writeString("Выход из программы...");
                    break;
                default:
                    outputWriter.writeString("Некорректный выбор. Пожалуйста, выберите пункт меню от 1 до 4.");
                    break;
            }
        } while (choice != EXIT_APP);
    }
}