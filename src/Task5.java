import java.util.Arrays;

public class Task5 {

    private static final String REGEX = "\\W";
    private static final String REGEX_ENY_SPACES = " +";
    private static final String PLEASE_INPUT_A_TEXT = "Please, input a text:";
    private static final String PLEASE_INPUT_SEARCHED_WORD = "Please, input searched word:";
    private static final String SEARCHED_WORD_IS_REPEATED = "Searched word is repeated ";
    private static final String TIMES = " times.";

    public static void main(String[] args) {
        System.out.println(PLEASE_INPUT_A_TEXT);
        String inputedText = Task4.inputText();
        System.out.println(PLEASE_INPUT_SEARCHED_WORD);
        char[] searchArray = Task3.inputWord();
        String searchWord = fromArrayToString(searchArray);
        int count = countWords(inputedText, searchWord);
        System.out.println(SEARCHED_WORD_IS_REPEATED + count + TIMES);
    }

    private static int countWords(String inputtedText, String searchWord) {
        String prepareText = inputtedText.replaceAll(REGEX, " ");
        String[] arrayText = prepareText.split(REGEX_ENY_SPACES);
        int count = 0;
        for (String anArrayText : arrayText) {
            if (anArrayText.toUpperCase().equals(searchWord.toUpperCase())) {
                count++;
            }
        }
        return count;
    }

    private static String fromArrayToString(char[] chars) {
        StringBuilder builder = new StringBuilder();
        for (char s : chars) {
            builder.append(s);
        }
        return builder.toString();
    }
}
