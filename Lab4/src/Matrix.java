/**
 * Created by alayn on 10/4/2016.
 */
public class Matrix {
    public static int[][] transpose(int[][] m){
        int[][] a = new int[m[0].length][m.length];
        for(int i = 0; i<a.length ; i++){
            for(int j = 0; j<a[0].length;j++){
                a[i][j] = m[j][i];
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[][] e = {{1,2,3},{4,5,6}};
        Matrix m = new Matrix();
        int[][] b = transpose(e);
        for(int i = 0; i<b.length; i++){
            for(int j = 0; j<b[0].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
