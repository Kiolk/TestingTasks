import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    private static final String INPUT_SOME_WORD = "Input any english word!";
    private static final String PLEASE_INPUT_ONE_WORD = "Please, input one word.";
    private static final String INPUTTED_WORD_IS_PALINDROME = "Inputted word is a palindrome :";

    public static void main(String[] args) {
        char[] word = inputWord();
        while (word == null) {
            word = inputWord();
        }
        System.out.println(INPUTTED_WORD_IS_PALINDROME + isPalindrome(word));

    }

    private static Boolean isPalindrome(char[] word) {
        int length = word.length - 1;
        for (int i = 0; i < length; ++i) {
            if (word[i] != word[length - i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] inputWord() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(PLEASE_INPUT_ONE_WORD);

            String inputString = bufferedReader.readLine();
            char[] chars = inputString.toCharArray();
            if (isWord(chars)) {
                return chars;
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            inputWord();
        }
        return null;
    }

    private static Boolean isWord(char[] chars) {
        if (chars.length == 0) {
            System.out.println(INPUT_SOME_WORD);

            return false;
        } else {
            for (char ch : chars) {
                if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                    return false;
                }
            }
            return true;
        }
    }
}

