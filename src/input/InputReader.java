package input;

import utils.Constants;
import utils.SDUtils;

import java.util.List;

public class InputReader {

    public boolean readInput(String s) {
        return validateInput(s);
    }

    private boolean validateInput(String s) {
        return !(Constants.APP_EXIT_SYMBOL.equals(s) || SDUtils.isEmpty(s));
    }

    public void processInput(List<String> songs) {
        InputParser inputParser = new InputParser();
        inputParser.processInput(songs);
    }

}
