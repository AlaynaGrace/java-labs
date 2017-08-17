import java.util.*;

public class FactR {

    // static system stack
    public static Stack<FactRecord> s = new Stack<FactRecord>();

    public static int returnedValue;  // global return method return value

    public static void main(String args[]) {
        int n = 3;
        s.push(new FactRecord(n));

        while(!s.isEmpty())
        {  // system loop goes until stack is empty
            ((FactRecord) s.top()).run();
        }  // end system loop

        // display final return value, if any
        System.out.println("\nFinal Value of " + n + " factorial is: " + returnedValue + "\n");
    }  // main method

}  // FactR class
//Pushes down original number. Takes n and multiplies it by 1.
//Next round it takes (n-1) and multiplies it by the previous product.
//Continues until it reaches 0, where it just multiplies by 1.