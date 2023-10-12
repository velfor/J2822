package ru.ylab.nikiforov.hw01;

import ru.ylab.nikiforov.hw01.dao.*;
import ru.ylab.nikiforov.hw01.service.*;
import ru.ylab.nikiforov.hw01.ui.*;
import java.util.Scanner;

/**
 * App - класс с точкой входа в приложение.
 *
 * @version   0.1 2023/10/10
 * @author    Павел Никифоров
 */

public class App 
{
    public static void main( String[] args )
    {
        PlayerRepository playerRepository = new InMemoryPlayerRepository();
        PlayerService playerService = new PlayerServiceImpl(playerRepository);
        TransactionRepository transactionRepository = new InMemoryTransactionRepository();
        TransactionService transactionService = new TransactionServiceImpl(transactionRepository, playerService);
        Scanner scanner = new Scanner(System.in);
        Input userInput = new ConsoleInputImpl(scanner);
        Output userOutput = new ConsoleOutputImpl();
        MainMenu mainMenu = new MainMenu(transactionService, userInput, userOutput);
        mainMenu.showMenu();
    }
}
