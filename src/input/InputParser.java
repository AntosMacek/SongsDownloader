package input;

import query.QueryLinksCreator;
import utils.Constants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class InputParser {

    void processInput(List<String> songs) {
        Map<String, String> songMap = new HashMap<>();
        for (String song : songs) {
            String link = song.replaceAll(Constants.SPACE, Constants.QUERY_WORDS_SEPARATOR);
            songMap.put(song, link);
        }
        QueryLinksCreator queryLinksCreator = new QueryLinksCreator();
        queryLinksCreator.composeQueryLinks(songMap);
    }

}
