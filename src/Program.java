import input.InputReader;
import utils.Constants;

import java.util.Scanner;

import static utils.SDUtils.*;

class Program {

    Program() {

    }

    void start() {
        initWelcome();
        initAsker();
    }

    private void initWelcome() {
        print(Constants.WELCOME_MSG);
        print(Constants.ENTER_SONGS);
    }

    private void initAsker() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            userInput = scanner.nextLine();
        } while (!isEmpty(userInput));
        scanner.close();
        InputReader inputReader = new InputReader();
        inputReader.readInput(userInput);
    }

}
