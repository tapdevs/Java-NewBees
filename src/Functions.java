import java.util.Scanner;

public class Functions {


    public static void main(String[] args){
        System.out.println();
        int userInput = getUserInput();
        System.out.println("User entered " + userInput);
        int fictorial = calculateFictorial(userInput);
        printFictorialValue(fictorial);
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

    private static int getUserInput() { // without parameter and return type
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
}
