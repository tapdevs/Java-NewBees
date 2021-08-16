public class PrimeNumber {

    public static void main(String[] args){
        System.out.print("1 ,2, 3, ");
        for (int i =5 ; i<30 ; i = i+2){
            boolean prime = true;
            for(int j = 2 ; j <= i/2 ; j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(i+" ,");
            }
        }
    }
}
