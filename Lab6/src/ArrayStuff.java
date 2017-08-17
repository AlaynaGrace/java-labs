import java.util.Arrays;

/**
 * Created by alayn on 10/18/2016.
 */
public class ArrayStuff {
    public static int[] clone(int[] a){
        int[] newClone = new int[a.length];
        for(int i = 0; i<a.length; i++){
            newClone[i] = a[i];
        }
        return newClone;
    }
    public static double[][] make2DArray(int row, int column){
        double[][] a = new double[row][column];
        for(int i=0; i<row; i++){
            for(int j =0; j<column; j++){
                a[i][j] = i+j;
            }
        }
        return a;
    }
    public static int sumDigits(int n){
        int ans = 0;
        if(n<10){
            ans = n;
        }
        else{
            ans = sumDigits(n/10) + n%10;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println("Clone:");
        int[] testArray = new int[10];
        for(int i=0; i<10;i++){
            testArray[i] = i;
        }
        ArrayStuff c = new ArrayStuff();
        int[] b = clone(testArray);
        if(Arrays.equals(b,testArray)){
            System.out.println("They're the same!");
        }
        else{
            System.out.println("They're not the same :(");
        }
        System.out.println();
        System.out.println("make2DArray:");
        double[][] d = make2DArray(5,6);
        for(int i = 0; i<d.length; i++){
            for(int j = 0; j<d[i].length; j++){
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("sumDigits:");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(542));
        System.out.println(sumDigits(3));
        System.out.println(sumDigits(43));
        System.out.println(sumDigits(5798));
    }
}
