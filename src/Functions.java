import java.util.Scanner;

public class Functions {

    /**
     * 1. Void
     * 2. Void with parameteres
     * 3. Return type
     * 4. Return type with parameters
     * @param args
     */

    public static void main(String[] args){
        System.out.println();

        int userInput = getUserInput();
        System.out.println("User entered " + userInput);
        int fictorial = calculateFictorial(userInput);
        printFictorialValue(fictorial);
        printEndOfProgrammeMessage();
        int y = findValueOfY(10);
        findValueOfX(y);

    }

    private static void printEndOfProgrammeMessage() { // without parameter
        System.out.println("Good bye");
    }

    private static void printFictorialValue(int fictorial) { // with parameter only

        System.out.println("Fictorial is  " + fictorial);
    }

    private static int calculateFictorial(int userInput) { // with parameter and return type
        int product =1;
        for(int i=1 ; i<=userInput; i++){
            product = product * i;
        }
        return product;
    }

    private static int findValueOfY(int z) {
        int y = 10 + 3*z;
        return y;

    }
    private static int findValueOfX(int y) {
        int x = 12 + 2 * y;
        return x;
    }
    private static int getUserInput() { // without parameter and return type
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
}
