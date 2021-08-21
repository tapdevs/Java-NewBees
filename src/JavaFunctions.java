import java.util.Scanner;

public class JavaFunctions {

    /**
     * Why we need functions ?
     *
     * To re use the code
     * @param args
     */
    public static void main(String[] args){
        printLine();
        int month = getUserInput();
        String monthName = getMonthName(month);
        String weather = getWeatherName(month);
        printMonthAndWeather(monthName, weather);

        askAgePrintLine();
        int age = getUserInput();

    }

    private static void askAgePrintLine() {
        System.out.println("Whats your age?");
    }

    private static int getUserInput() {

        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        return monthNumber;
    }


    /**
     *  Simple void function with no return type
     *
     */

    static void printLine(){
        System.out.println("Enter your month of birth in digits");
    }

    /**
     * Functions with parameter and no return type
     *
     * @param month
     * @param weather
     */
    static void printMonthAndWeather(String month, String weather){
        System.out.println("You were born in "+month +" and weather was " + weather);
    }


    /**
     * Function with paramter and return type
     *
     * @param month
     * @return name of month
     */
    private static String getMonthName(int month) {

        String monthName = "";
        if(month == 1){
            monthName = "January";
        }


        if(month == 2){

            monthName = "Feb";
        }
        if(month == 3){

            monthName = "March";
        }
        if(month == 4){
            monthName = "April";
        }
        if(month == 5){

            monthName = "May";
        }
        if(month == 6){

            monthName = "June";
        }
        if(month == 7){

            monthName = "July";
        }
        if(month == 8){

            monthName = "August";
        }
        if(month == 9){

            monthName = "September";
        }
        if(month == 10){

            monthName = "October";
        }
        if(month == 11){

            monthName = "November";
        }

        if(month == 12){

            monthName = "December";
        }
        return monthName;
    }

    /**
     * without return type functions are called void functions.
     * Return type functions values can be saved in a variable.
     * Void function or non-return type functions cannot be stored in a variable
     */


    private static String getWeatherName(int month) {
        String weatherName = "";
        /**
         * Detect type of weather you were born in
         *
         */

        if((month >= 1 && month < 3) || (month >= 10 && month <=12) ){ // && operator , || operator
            weatherName = "Winter";
        }

        if(month >= 3 && month <= 4){
            weatherName = "Spring";
        }

        if(month > 4 && month < 9){
            weatherName = "Summer";
        }

        if(month == 9){
            weatherName = "Autumn";
        }

        return weatherName;
    }
}
