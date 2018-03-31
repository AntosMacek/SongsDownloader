package query;

import utils.Constants;

import java.util.Map;

public class QueryLinksCreator {

    public void composeQueryLinks(Map<String, String> songMap) {
        for (Map.Entry songTitle : songMap.entrySet()) {
            String songLink = Constants.YT_QUERY_TEMPLATE + songTitle.getValue();
            songMap.put((String) songTitle.getKey(), songLink);
        }
        QueryResultProcessor queryResultProcessor = new QueryResultProcessor();
        queryResultProcessor.querySongs(songMap);
    }

}
