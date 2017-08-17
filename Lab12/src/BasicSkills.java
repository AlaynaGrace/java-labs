/**
 * Created by alayn on 11/29/2016.
 */
public class BasicSkills {
    public static void FizzBuzz(int n){
        for(int i = 1; i<= n; i++){
            if(i%3 == 0 && i%5 != 0){
                System.out.println("Fizz");
            }
            else{
                if(i%5 == 0 && i%3 != 0){
                    System.out.println("Buzz");
                }
                else{
                    if(i%3 == 0 && i%5 ==0){
                        System.out.println("FizzBuzz");
                    }
                    else{
                        System.out.println(i);
                    }
                }
            }
        }
    }
    public static int[] odd(int n){
        int m = n;
        if(n<0){
            n = n * -1;
        }
        int[] a = new int[n];
        int i = 0;
        int j = 0;
        while(j<n){
            if(i%2 != 0){
                a[j] = i;
                j++;
            }
            i++;
        }
        if(m<0){
            for(i = 0; i<n; i++){
                a[i] = a[i] * -1;
            }
        }
        return a;
    }
    public static String[] names(String[] n){
        String[] names;
        int count = 0;
        for(int i = 0; i<n.length; i++){
            if(n[i].length() == 1){
                count++;
            }
        }
        names = new String[count];
        int c = 0;
        for(int i = 0; i<n.length; i++){
            if(n[i].length() == 1){
                names[c] = n[i];
                c++;
            }
        }
        return names;
    }


    public static void main(String[] args) {
        System.out.println("Fizz, Buzz, FizzBuzz for first 20 numbers");
        FizzBuzz(20);
        System.out.println();
        System.out.println("First 10 odd numbers");
        int[] d = odd(10);
        for(int i = 0; i<d.length; i++){
            System.out.println(d[i]);
        }
        System.out.println();
        System.out.println("List of names");
        String[] n = {"A", "Me", "Bob", "C", "Cathy", "G", "Dave", "Harold", "N"};
        String[] b = names(n);
        for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}
