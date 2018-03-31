package utils;

public class Constants {

    private static final String NEW_LINE = "\n";
    public static final String SPACE = " ";
    public static final String QUERY_WORDS_SEPARATOR = "+";

    private static final String DELIMITER_EQUALITY = NEW_LINE + "===================================" + NEW_LINE;

    public static final String APP_EXIT_SYMBOL = "/exit";

    public static final String WELCOME_MSG = DELIMITER_EQUALITY + "Welcome to Songs Downloader ver 0.1!" + DELIMITER_EQUALITY;
    public static final String ENTER_SONGS = "Enter songs' names (each on new line): ";

    public static final String YT_QUERY_TEMPLATE = "https://www.youtube.com/results?search_query="; // Delimiter between words is QUERY_WORDS_SEPARATOR

}
