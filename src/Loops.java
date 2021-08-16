import java.util.Scanner;

public class Loops {

    public static void main(String[] args){

        System.out.println("Seee table of ?");
        Scanner scanner = new Scanner(System.in);
        int table = scanner.nextInt();
        for(int i = 1; i <= 10;  ++i){
            // int i = 1 Starting condition
            // i <= 10 Terminating condition
            // i++ increment or decrement
            int product = table*i;
            System.out.println(""+table +" x " +i+ "=" +product);
        }
    }
}
