import java.util.Scanner;

/**
 * Created by alayn on 10/4/2016.
 */
public class ScannerReview {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers? ");
        int num = scanner.nextInt();
        int[] a = new int[num];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter " + num + " integer(s): ");
        String input = s1.nextLine();
        Scanner s = new Scanner(input);
        for(int i = 0; i<num; i++){
            a[i] = s.nextInt();
        }
        System.out.print("Entered: ");
        for(int i = 0; i<num; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();
        System.out.print("Reversed: ");
        for(int i = 0; i<num; i++){
            System.out.print(+ a[num - i - 1] + " ");
        }
        System.out.println();
        int max = a[0];
        for(int i = 0; i<num; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Max: " + max);
        int min = a[0];
        for(int i = 0; i<num; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Min: " + min);

    }
}
