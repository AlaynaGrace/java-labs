import java.util.Stack;

/**
 * Created by alayn on 11/22/2016.
 */
public class HanoiR {
    public static Stack<HanoiRecord> s = new Stack<>();
    public static int loops = 0;
    public static void main(String[] args) {
        int n = 3;
        char source = 'a';
        char temp = 'b';
        char dest = 'c';

        s.push(new HanoiRecord(n,source,dest,temp));


        while(!s.isEmpty()) {
            s.peek().run();
        }
        System.out.println(loops);
    }
}
