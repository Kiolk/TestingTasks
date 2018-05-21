import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    private static final String INPUT_THE_LENGTH_OF_THE_FIRST_LINE = "Input the length of the first line";
    private static final String ERROR_TRY_TO_INPUT_NUMBER = "Error. Try to input number";
    private static final String INPUT_THE_LENGTH_OF_THE_SECOND_LINE = "Input the length of the second line";
    private static final String INPUT_THE_LENGTH_OF_THE_THIRD_LINE = "Input the length of the third line";
    private static final String PROBABILITY_OF_THREE_SEGMENTS_FORMING_A_RECTANGLE_TRIANGLE_IS = "Probability of three segments forming a rectangle triangle is ";

    public static void main(String[] args) {
        System.out.println(INPUT_THE_LENGTH_OF_THE_FIRST_LINE);
        Float firstNumber = inputNumber();
        while (firstNumber == null) {
            System.out.println(ERROR_TRY_TO_INPUT_NUMBER);
            firstNumber = inputNumber();
        }
        System.out.println(INPUT_THE_LENGTH_OF_THE_SECOND_LINE);
        Float second = inputNumber();
        while (second == null) {
            System.out.println(ERROR_TRY_TO_INPUT_NUMBER);
            second = inputNumber();
        }
        System.out.println(INPUT_THE_LENGTH_OF_THE_THIRD_LINE);
        Float third = inputNumber();
        while (third == null) {
            System.out.println(ERROR_TRY_TO_INPUT_NUMBER);
            third = inputNumber();
        }
        System.out.println(PROBABILITY_OF_THREE_SEGMENTS_FORMING_A_RECTANGLE_TRIANGLE_IS + isRectangleTriangle(firstNumber, second, third));
    }

    private static Boolean isRectangleTriangle(Float firstNumber, Float second, Float third) {
        Float hippo = findHippo(firstNumber, second, third);
        float a = 0;
        float b = 0;
        if (hippo.equals(firstNumber)) {
            a = second;
            b = third;
        } else if (hippo.equals(second)) {
            a = firstNumber;
            b = third;
        } else {
            a = second;
            b = firstNumber;
        }
        return Math.pow(hippo, 2.0) == Math.pow(a, 2.0) + Math.pow(b, 2.0);
    }

    private static Float findHippo(Float firstNumber, Float second, Float third) {
        Float a = Math.max(firstNumber, second);
        return Math.max(a, third);
    }

    private static Float inputNumber() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Float inputNumber;
        try {
            String inputtedString = bufferedReader.readLine();
            inputNumber = Float.parseFloat(inputtedString);
            return inputNumber;
        } catch (NumberFormatException | IOException e) {
            return null;
        }
    }
}

