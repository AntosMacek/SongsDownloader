import input.InputReader;
import utils.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static utils.SDUtils.*;

class Program {

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
        InputReader inputReader = new InputReader();
        List<String> songs = new ArrayList<>();
        String userInput;
        while (inputReader.readInput(userInput = scanner.nextLine())) {
            songs.add(userInput);
        }
        scanner.close();
        inputReader.processInput(songs);
    }

}
