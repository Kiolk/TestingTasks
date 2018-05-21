import java.util.ArrayList;

public class Task8 {

    private static final int MAX = 100;
    private static final int MIN = 0;
    private static final String INPUT_THE_LENGTH_OF_NUMBERS_FOLLOWING_NO_MORE_THAN = "Input the length of numbers following(no more than";
    private static final String INPUTTED_NUMBER_HAS_TO_BE_IN_RANGE_FROM = "Inputted number has to be in range from ";
    private static final String TO = " to ";
    private static final String NUMBER_OF_PALINDROMES_FROM = "Number of palindromes from ";
    private static final String EQUAL = " equal: ";

    public static void main(String[] args) {
        System.out.println(INPUT_THE_LENGTH_OF_NUMBERS_FOLLOWING_NO_MORE_THAN + MAX);
        int input = Task1.inputNumber();
        while ((input < MIN || input > MAX)) {
            System.out.println(INPUTTED_NUMBER_HAS_TO_BE_IN_RANGE_FROM + MIN + TO + MAX);
            input = Task1.inputNumber();
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int i = 0; i <= input; ++i) {
            arrayList.add(numberToArray(i));
        }
        int numberOfPolindrs = 0;
        for (int[] singleNumber : arrayList) {
            if (isPolindrom(singleNumber)) {
                System.out.println(numberFromArray(singleNumber));
                numberOfPolindrs++;
            }
        }
        System.out.println(NUMBER_OF_PALINDROMES_FROM + MIN + TO + input + EQUAL + numberOfPolindrs);
    }

    private static String numberFromArray(int[] singleNumber) {
        StringBuilder builder = new StringBuilder();
        for (int num : singleNumber
                ) {
            builder.append(num);
        }
        return builder.toString();
    }

    private static boolean isPolindrom(int[] singleNumber) {
        int size = singleNumber.length;
        for (int i = 0; i < size; ++i) {
            int num = singleNumber[size - 1 - i];
            if (num != singleNumber[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] numberToArray(int i) {
        int size = 1;
        int scopeNumber = i;
        while (scopeNumber >=
                10) {
            size++;
            scopeNumber = scopeNumber / 10;
        }
        int[] arrayNumber = new int[size];
        for (int b = size - 1; b >= 0; --b) {
            if (b == 0) {
                arrayNumber[b] = i;
            } else {
                arrayNumber[b] = i % 10;
                i = i / 10;
            }
        }
        return arrayNumber;
    }
}
