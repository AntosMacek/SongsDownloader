import input.InputReader;
import utils.Constants;

import java.util.ArrayList;
import java.util.List;
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
        InputReader inputReader = new InputReader();
        List<String> userInput = new ArrayList<String>();
        String input;
        while (inputReader.readInput(input = scanner.nextLine())) {
            input = scanner.nextLine();
        	if (inputReader.validateInput(input)) {
       			userInput.add(input);
        	} else {
        		print("Your input is not valid. Please try again. You've entered:" + Constants.NEW_LINE + input);
        	}
        }
        scanner.close();
        
        print("Song list:");
        for (String song: userInput) {
        	print(song);
        }
    }

}
