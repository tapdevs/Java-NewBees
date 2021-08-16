public class IncrementDecrement {

    public static void main(String[] args){
        int firstNumber = 1;
        int secondNumber = 2;
        int postIncrement = firstNumber++; //2
        int preIncrement = ++secondNumber; //4
        int verifyPostIncrement = firstNumber;

        System.out.println("Post increment =" +postIncrement);
        System.out.println("Pre increment =" +preIncrement);
        System.out.println("verifyPostIncrement increment =" +verifyPostIncrement);

    }
}
