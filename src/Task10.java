public class Task10 {

    private static final String SPACE = " ";

    public static void main(String[] args) {
        System.out.println("Input one digit number");
        System.out.println("First number:");
        int first = Task1.inputNumber();
        while ((first < 0 || first > 9)){
            System.out.println("Input single digit positive number");
            first = Task1.inputNumber();
        }
        System.out.println("Second number:");
        int second = Task1.inputNumber();
        while ((second < 0 || second > 9)){
            System.out.println("Input single digit positive number");
            second = Task1.inputNumber();
        }
        System.out.println("Third number:");
        int third = Task1.inputNumber();
        while ((third< 0 || third > 9)){
            System.out.println("Input single digit positive number");
            third = Task1.inputNumber();
        }
        int [] combination = new int []{ Integer.parseInt(""+first + second + third),
                Integer.parseInt(""+first+ third + second),
                Integer.parseInt(""+second + first + third),
                Integer.parseInt(""+ second + third + first),
                Integer.parseInt(""+third + second + first),
                Integer.parseInt(""+third + first + second)};
        int [] printed = new int [combination.length];

        for (int i = 0; i < combination.length; ++i){
            int num = combination[i];
            Boolean isPrinted = false;
            for(int num2 : printed){
                if(num == num2){
                    isPrinted = true;
                }
            }
            if(!isPrinted){
                System.out.print(num + SPACE);
                printed[i] = num;
            }
        }
    }
}
