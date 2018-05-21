import java.util.Random;

public class Task7 {

    private static final int UPPER_BORDER = 89;
    private static final String PLEASE_INPUT_THE_LENGTH_OF_ARRAY_OF_RANDOM_DOUBLE_NUMBERS = "Please, input the length of array of random double numbers: ";
    private static final String ERROR_NEEDED_A_POSITIVE_NUMBER = "Error. Needed a positive number.";
    private static final String GENERATE_THIS_ARRAY_OF_RANDOM_NUMBER_BY_SIZE = "Generate this array of random number by size ";
    private static final String STRING = ":";
    private static final String MINIMUM_NUMBER_IN_THIS_ARRAY_IS = "\nMinimum number in this array is ";
    private static final String MAXIMUM_NUMBER_IN_THIS_ARRAY_IS = "Maximum number in this array is ";

    public static void main(String[] args) {
        System.out.println(PLEASE_INPUT_THE_LENGTH_OF_ARRAY_OF_RANDOM_DOUBLE_NUMBERS);
        int inputNumber = Task1.inputNumber();
        while (inputNumber <= 0) {
            System.out.println(ERROR_NEEDED_A_POSITIVE_NUMBER);
            inputNumber = Task1.inputNumber();
        }
        int[] randomArray = new int[inputNumber];
        for (int i = 0; i < inputNumber; ++i) {
            int random = 99 - new Random().nextInt(UPPER_BORDER);
            randomArray[i] = random;
        }
        System.out.println(GENERATE_THIS_ARRAY_OF_RANDOM_NUMBER_BY_SIZE + inputNumber + STRING);
        for (int number : randomArray
                ) {
            System.out.print(number + " ");
        }
        System.out.println(MINIMUM_NUMBER_IN_THIS_ARRAY_IS + findMin(randomArray));
        System.out.println(MAXIMUM_NUMBER_IN_THIS_ARRAY_IS + findMax(randomArray));
    }

    private static int findMax(int[] randomArray) {
        int maxNumber = randomArray[0];
        for (int number : randomArray) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    private static int findMin(int[] randomArray) {
        int minNumber = randomArray[0];
        for (int number : randomArray) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }
}

