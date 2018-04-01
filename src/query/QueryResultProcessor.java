package query;

import java.util.Map;

import utils.SDUtils;

public class QueryResultProcessor {
	
	public void printResult(Map<String, String> map) {
		SDUtils.print("----------------------------------");
		for(Map.Entry<String, String> entry: map.entrySet()) {
			SDUtils.print(entry.getKey() + "     " + entry.getValue());
		}
		SDUtils.print("----------------------------------");
	}
}
