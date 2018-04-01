package input;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import query.QueryLinksCreator;
import query.QueryResultProcessor;


public class InputParser {

    // TODO: create a method processInput, which will receive the user's input and prepare, then pass it to query.QueryLinksCreator.
	public void processInput(List<String> keywordList) {
		Map<String, String> linksMap = new HashMap<String, String>();
		// fill linksMap
    	for (String keywords: keywordList) {
    		String link = QueryLinksCreator.createLink(keywords);
    		linksMap.put(keywords, link);
    	} 
    	QueryResultProcessor processor = new QueryResultProcessor();
    	processor.printResult(linksMap);
    }
}
