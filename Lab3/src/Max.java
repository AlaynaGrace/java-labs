import java.util.Scanner;

/**
 * Created by alayn on 9/27/2016.
 */
public class Max {
    public int maxDigit(int num){
        int maxInt = 0;
        int r = 0;
        String number = String.valueOf(num);
        int[] numArr = new int[number.length()];
        for(int i=0; i<number.length(); i++){
            numArr[i] = Character.getNumericValue(number.charAt(i));
        }
        for(int i = 0; i<numArr.length; i++){
            int a = numArr[i];
            if(a > r){
                r = a;
                maxInt = numArr[i];
            }
        }
        System.out.println("The maximum number is: " + maxInt);
        return maxInt;
    }
    public int maxDigit2(int num){
        if(num < 10){
            return num;
        }
        int x = maxDigit2(num / 10);
        int max = num % 10;
        if(max < x){
            max = x;
        }
        System.out.println("The maximum number is: " + max);
        return max;

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        Scanner s = new Scanner(input);
        int num = s.nextInt();
        Max m1 = new Max();
        m1.maxDigit(num);

        m1.maxDigit2(num);

    }
}
