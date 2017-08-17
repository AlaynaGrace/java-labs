/**
 * Created by alayn on 9/27/2016.
 */
public class ReverseInt {
    public static int reverse(int num){
        String number = String.valueOf(num);
        int[] a = new int[number.length()];
        for(int i = 0; i < number.length(); i++){
            a[i] = Character.getNumericValue(number.charAt(i));
        }
        String newNum = "";
        for(int i = 0; i < a.length; i++){
            newNum += String.valueOf(a[a.length - i - 1]);
        }
        int actual = Integer.valueOf(newNum);
        System.out.println("Reverse1: " + actual);
        return actual;
    }
    public static void main(String[] args){
        ReverseInt r = new ReverseInt();
        r.reverse(123);
        r.reverse2(123);
    }
    public static int reverse2(int num) {
        if (num < 10) {
            return num;
        } else {
            return reverse2(num / 10) + ((num % 10) * (int) Math.pow(10, (int) Math.log10(num)));
        }
    }
}
