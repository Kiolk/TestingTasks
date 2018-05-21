public class Task2 {

    private static final String INPUT_A_FIRST_NUMBER = "Input a first number: ";
    private static final String INPUT_A_SECOND_NUMBER = "Input a second number: ";
    private static final String SUM_OF_FIRST_AND_SECOND_NUMBERS_IS = "Sum of first and second numbers is ";
    private static final String DIFFERENCE_BETWEEN_FIRST_AND_SECOND_NUMBERS_IS = "Difference between first and second numbers is ";
    private static final String GCD_OF_FIRST_AND_SECOND_NUMBERS_IS = "GCD of first and second numbers is ";
    private static final String LCM_OF_FIRST_AND_SECOND_NUMBERS_IS = "LCM of first and second numbers is ";

    public static void main(String[] args) {
        System.out.println(INPUT_A_FIRST_NUMBER);
        int firstNumber = Task1.inputNumber();
        System.out.println(INPUT_A_SECOND_NUMBER);
        int secondNumber = Task1.inputNumber();
        System.out.println(SUM_OF_FIRST_AND_SECOND_NUMBERS_IS + sum(firstNumber, secondNumber));
        System.out.println(DIFFERENCE_BETWEEN_FIRST_AND_SECOND_NUMBERS_IS + min(firstNumber, secondNumber));
        System.out.println(GCD_OF_FIRST_AND_SECOND_NUMBERS_IS + lcm(firstNumber, secondNumber));
        System.out.println(LCM_OF_FIRST_AND_SECOND_NUMBERS_IS + gcd(firstNumber, secondNumber));
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int min(int a, int b) {
        return a - b;
    }
}
