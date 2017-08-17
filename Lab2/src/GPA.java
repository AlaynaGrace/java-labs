//import java.util.Scanner;

import java.util.Scanner;

/**
 * Created by alayn on 9/20/2016.
 */
public class GPA{
    private String gpaStr;
    private double ltrs;
    private double nums;
    private int count;

    public GPA(String gpa){

        gpaStr = gpa;
    }
    public double letters(){
        Scanner scanner = new Scanner(gpaStr);
        ltrs = 0;
        double gpa = 0;
        count = 0;
        while(scanner.hasNext()){
            if(scanner.next().equals("a")){
                ltrs = 4.0;
                nums = scanner.nextInt();
                gpa += ltrs * nums;

            }
            if(scanner.next().equals("a-")){
                ltrs = 3.667;
                nums = scanner.nextInt();
                gpa += ltrs * nums;
            }
            if(scanner.next().equals("b+")){
                ltrs = 3.333;
                nums = scanner.nextInt();
                gpa += ltrs * nums;
            }
            if(scanner.next().equals("b")){
                ltrs = 3.0;
                nums = scanner.nextInt();
                gpa += ltrs * nums;
            }
            if(scanner.next().equals("b-")){
                ltrs = 2.667;
                nums = scanner.nextInt();
                gpa += ltrs * nums;
            }
            if(scanner.next().equals("c+")){
                ltrs = 2.333;
                nums = scanner.nextInt();
                gpa += ltrs * nums;
            }
            if(scanner.next().equals("c")){
                ltrs = 2.0;
                nums = scanner.nextInt();
                gpa += ltrs * nums;
            }
             if(scanner.next().equals("c-")){
                 ltrs = 1.667;
                 nums = scanner.nextInt();
                 gpa += ltrs * nums;

             }
             if(scanner.next().equals("d+")){
                 ltrs = 1.333;
                 nums = scanner.nextInt();
                 gpa += ltrs * nums;
             }
             if(scanner.next().equals("d")){
                 ltrs = 1.0;
                 nums = scanner.nextInt();
                 gpa += ltrs * nums;
             }
             if(scanner.next().equals("f")){
                 ltrs = 0;
                 gpa += 0;
             }
             count += 1;
        }
        return gpa / count;

    }
    public static void main(String[] args){
        GPA g = new GPA("a 4");
        g.letters();
    }

}

