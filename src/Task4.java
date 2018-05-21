import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    private static final String COMMA = ",";
    private static final String WHITE_SPACE = " ";
    private static final String REGEX_ENY_SPACES = " +";
    private static final String EMPTY_STRING = "";
    private static final String PLEASE_INPUT_A_SENTENCE = "Please, input a sentence.";
    private static final String WORDS = " words.";
    private static final String INPUTTED_SENTENCE_CONTAIN = "Inputted sentence contain ";

    public static void main(String[] args) {
        System.out.println(PLEASE_INPUT_A_SENTENCE);
        String inputted = inputText();
        System.out.println(INPUTTED_SENTENCE_CONTAIN + countWords(inputted) + WORDS);
    }

    private static int countWords(String inputted) {
        inputted = inputted.replace(COMMA, WHITE_SPACE);
        String[] array = inputted.split(REGEX_ENY_SPACES);
        if (array.length == 1 && array[0].equals(EMPTY_STRING)) return 0;
        return array.length;
    }

    public static String inputText() {
        String inputted = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputted = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputted;
    }
}
