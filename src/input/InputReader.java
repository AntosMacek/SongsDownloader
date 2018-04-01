package input;

import java.util.List;

import utils.Constants;
import utils.SDUtils;

public class InputReader {

    // TODO: Make readInput to return boolean and read its returned value in Program.initAsker while-loop.
    public boolean readInput(String s) {
    	if (s.contains(Constants.APP_EXIT_SYMBOL)) {
    		return false;
    	}
    	return true;
    }

    // TODO: Create method boolean validateInput, which will be checking if the user's input is correct according to our rules. Rules will arrive later.
    public boolean validateInput(String s) {
        if (SDUtils.notEmpty(s)) {
        	return true;
        }
        return false;
    }
    
    public void processInput(List<String> list) {
    	InputParser inputParser = new InputParser(); 
    	inputParser.processInput(list);
    }
}
