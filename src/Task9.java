public class Task9 {

    private static final String DIVIDER = ", ";
    private static final String PLEASE_INPUT_AN_UPPER_BORDER_OF_NUMBER_RANGE = "Please, input an upper border of number range.";
    private static final String NEED_POSITIVE_NUMBER = "Need positive number.";
    private static final String EVEN_NUMBERS = "Even numbers: ";
    private static final String SUM_OF_ALL_EVEN_NUMBERS_IS_EQUAL = "\nSum of all even numbers is equal: ";

    public static void main(String[] args) {
        System.out.println(PLEASE_INPUT_AN_UPPER_BORDER_OF_NUMBER_RANGE);
        int input = Task1.inputNumber();
        while (input <= 0) {
            System.out.println(NEED_POSITIVE_NUMBER);
            input = Task1.inputNumber();
        }
        int sumOfEvenNumbers = 0;
        System.out.print(EVEN_NUMBERS);
        for (int i = 0; i <= input; ++i) {
            if (i % 2 == 0) {
                System.out.print(i);
                sumOfEvenNumbers += i;
                if (i <= input - 2) {
                    System.out.print(DIVIDER);
                }
            }
        }
        System.out.print(SUM_OF_ALL_EVEN_NUMBERS_IS_EQUAL + sumOfEvenNumbers);
    }
}
