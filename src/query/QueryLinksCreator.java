package query;


import utils.Constants;

public class QueryLinksCreator {

	public static String createLink(String keywords) {
		String fullLink = keywords.replaceAll(" ", "+");
		fullLink = Constants.YT_QUERY_TEMPLATE + fullLink;
		return fullLink;
	}

    // TODO: Using Constants.YT_QUERY_TEMPLATE create query links for every song and pass them to query.QueryResultProcessor.
	
}
