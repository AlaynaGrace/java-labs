import java.util.Scanner;

/**
 * Created by alayn on 10/4/2016.
 */
public class Histogram {
    private int high;
    private int low;
    private int[] a;
    private static String b = "";
    public Histogram(int m, int n){
        if(m>n){
            high = m;
            low = n;
        }
        else{
            high = n;
            low = m;
        }
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Data? ");
        String input = scanner.nextLine();
        System.out.println();
        Scanner s = new Scanner(input);
        int y = 0;
        while(s.hasNextInt()){
            y = s.nextInt();
            if(y>=low && y<=high) {
                count++;
            }
            else{
                b += String.valueOf(y) + " ";
            }
        }
        a = new int[count+1];
        Scanner scanner1 = new Scanner(input);
        int x = 0;
        for(int i = 0; i<=count; i++){
            x = scanner1.nextInt();
            if(x>=low && x<=high){
                a[i] = x;
            }
        }


    }
    public boolean add(int i){
        boolean tf = true;
        if(i>high || i<low){
            tf = false;
        }
        else{
            int[] ar = new int[a.length + 1];
            for(int j = 0; j<a.length; j++){
                ar[j] = a[j];
            }
            ar[ar.length-1] = i;
            a = ar;
        }
        if(tf == false){
            System.out.println(i + " is not in the range");
        }
        return tf;
    }
    public String toString(){
        String fin = "";
        int count = 0;
        for(int i = low; i<=high; i++){
            for(int j=0; j<a.length;j++){
                if(a[j] == i){
                    count ++;
                }
            }
            fin += String.valueOf(i) + ":";
            for(int k=0; k<count; k++){
                fin += "*";
            }
            fin += "\n";
            count = 0;
        }
        return fin;

    }
    public void addOutofRange(int i){
        if(i < low){
            low = i;
        }
        if(i>high){
            high = i;
        }
        int[] ar = new int[a.length + 1];
        for(int j = 0; j<a.length; j++){
            ar[j] = a[j];
        }
        ar[ar.length-1] = i;
        a = ar;
    }
    public static void main(String[] args){
        Scanner s2 = new Scanner(System.in);
        System.out.print("Range? ");
        int m = s2.nextInt();
        int n = s2.nextInt();
        System.out.println();
        Histogram h = new Histogram(m,n);
        int z = 0;
        if(b != ""){
            Scanner s3 = new Scanner(b);
            while(s3.hasNextInt()){
                z = s3.nextInt();
                h.add(z);
            }
        }
        System.out.println();
        System.out.print(h);

        Scanner s4 = new Scanner(System.in);
        System.out.print("Enter one data point: ");
        int number = s4.nextInt();
        System.out.println();
        h.addOutofRange(number);
        System.out.println(h);

        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("More data? ");
        String input = s.nextLine();
        Scanner s1 = new Scanner(input);
        int newNum;
        while(s1.hasNextInt()){
            newNum = s1.nextInt();
            h.add(newNum);
        }
        System.out.println();
        System.out.println(h);


    }

}
