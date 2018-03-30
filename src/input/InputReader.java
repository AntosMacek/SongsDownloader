package input;

import utils.Constants;
import utils.SDUtils;

public class InputReader {

    // TODO: Make readInput to return boolean and read its returned value in Program.initAsker while-loop.
    public void readInput(String s) {
        SDUtils.print("You've entered:" + Constants.NEW_LINE + s);
    }

    // TODO: Create method boolean validateInput, which will be checking if the user's input is correct according to our rules. Rules will arrive later.

    // TODO: create an object of input.InputParser in input.InputReader.readInput and pass to input.InputParser.processInput user's input.

}
