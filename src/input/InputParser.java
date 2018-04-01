package input;

import java.util.List;

import query.QueryLinksCreator;


public class InputParser {

    // TODO: create a method processInput, which will receive the user's input and prepare, then pass it to query.QueryLinksCreator.
	public void processInput(List<String> list) {
    	for (String item: list) {
    		String formattedItem = item.replaceAll(" ", "+");
    		QueryLinksCreator qlc = new QueryLinksCreator();
    		
    	} 
    }
}
