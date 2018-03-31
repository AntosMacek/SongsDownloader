package query;

import utils.SDUtils;

import java.util.Arrays;
import java.util.Map;

class QueryResultProcessor {

    void querySongs(Map<String, String> songMap) {
        SDUtils.print(Arrays.toString(songMap.entrySet().toArray()));
    }

}
