import java.util.Scanner;

/**
 * Created by alayn on 11/8/2016.
 */
public class Postfix {
    public static double evaluate(String[] expression){
        Stack s = new Stack();
        Scanner scanner;
        for(int i = 0; i<expression.length;i++){
            scanner = new Scanner(expression[i]);
            if(scanner.hasNextDouble()){
                s.push(scanner.nextDouble());
            }
            else{
                double val = 0;
                double i1 = (double) s.top();
                s.pop();
                double i2 = (double) s.top();
                s.pop();
                switch(scanner.next()){
                    case "+":
                        val = i1 + i2;
                        break;
                    case "-":
                        val = i1 - i2;
                        break;
                    case "*":
                        val = i1 * i2;
                        break;
                    case "/":
                        val = i2/i1;
                        break;
                }
                s.push(val);
            }
        }
        return (double) s.pop();
    }

    public static void main(String[] args) {
        String[] s = {"5", "2", "+"};
        System.out.println(evaluate(s));
        String[] s1 = {"1","2","-"};
        System.out.println(evaluate(s1));
        String[] s2 = {"4","5","*","3","+"};
        System.out.println(evaluate(s2));
        String[] s3 = {"1","2","+","3","4","+","/"};
        System.out.println(evaluate(s3));
    }
}
