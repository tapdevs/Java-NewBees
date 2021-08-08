import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /**
         * primitve data types
         *
         * fixed size in memory
         *
         * 1. int = ,-2,-1,0,1,2,3 ...... 32,535 (32- bit) 32,456
         * 2. float = 1.0, 1.1 (32 - bit)
         * 3. long = 235465454645456465 (64- bit)
         * 4. double = 5464654646.656565 (64- bit)
         *
         *
         */
        System.out.println("Enter your month of birth in digits");
        int month = scanner.nextInt();


        /**
         * Operators
         * Comparison operators = (==) , (>) , (<), >= , <=
         * Logical operators ,  ! , && , ||
         */

        if(month == 1){
            System.out.println("You were born in January");
        }


        if(month == 2){
            System.out.println("You were born in Feb");
        }
        if(month == 3){
            System.out.println("You were born in March");
        }
        if(month == 4){
            System.out.println("You were born in April");
        }
        if(month == 5){
            System.out.println("You were born in May");
        }

        if(month == 12){
            System.out.println("You were born in December");
        }

        /**
         * Detect type of weather you were born in
         *
         */

        if((month >= 1 && month < 3) || (month >= 10 && month <=12) ){ // && operator , || operator
            System.out.println("You were born in Winter");
        }

        if(month >= 3 && month <= 4){
            System.out.println("You were born in Spring");
        }

        if(month > 4 && month < 9){
            System.out.println("You were born in Summer");
        }

        if(month == 9){
            System.out.println("You were born in Autumn");
        }


    }

}
