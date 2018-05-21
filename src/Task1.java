import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    private static final String PLEASE_ENTER_WHOLE_NUMBER = "Please enter a whole number:";
    private static final String INPUTTED_NUMBER_ISN_T_WHOLE_NUMBER = "Inputted number isn't a whole number";
    private static final String ERROR_INPUT = "Error. Incorrect inputted number";
    private static final String THIS_NUMBER_IS_ODD_NUMBER = "This number is an even number: ";
    private static final String THIS_NUMBER_IS_SIMPLE_NUMBER = "This number is a simple number: ";

    public static void main(String[] args) {
        int inputtedNumber = inputNumber();
        System.out.println(THIS_NUMBER_IS_ODD_NUMBER + checkEvenNumber(inputtedNumber));
        System.out.println(THIS_NUMBER_IS_SIMPLE_NUMBER + checkSimpleNumber(inputtedNumber));
    }

    public static int inputNumber() {
        int result;
        System.out.println(PLEASE_ENTER_WHOLE_NUMBER);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string = bufferedReader.readLine();
            result = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println(INPUTTED_NUMBER_ISN_T_WHOLE_NUMBER);
            result = inputNumber();
            return result;
        } catch (IOException e) {
            System.out.println(ERROR_INPUT);
            result = inputNumber();
            return result;
        }
        return result;
    }

    private static Boolean checkEvenNumber(int number) {
        return number % 2 == 0;
    }

    private static Boolean checkSimpleNumber(int number) {

        int findRange = number - 1;
        if (findRange < 0) {
            findRange = findRange * (-1);
        }
        for (int i = 2; i < findRange; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
