import java.util.Scanner;

/**
 * Created by alayn on 11/8/2016.
 */
public class TestException {
    static int divide(int numerator, int denominator) throws ArithmeticException{
        if(denominator == 0){
            throw new ArithmeticException("Divided by 0");
        }
        else{
            return numerator/denominator;
        }
    }
    static int digitToInt(String s){
        Scanner scanner = new Scanner(s);
        if(scanner.hasNextInt()){
            return scanner.nextInt();

        }
        else{
            NumberFormatException e = new NumberFormatException("Not a number");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            divide(1,0);

        } catch (ArithmeticException e) {
            System.out.println("Error: Divided by 0");
        }
        System.out.println();
        try{
            digitToInt("s");
        } catch(RuntimeException e){
            System.out.println("Error: Not an int");
        }
    }
}
