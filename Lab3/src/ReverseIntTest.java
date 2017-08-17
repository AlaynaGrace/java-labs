import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alayn on 9/27/2016.
 */
public class ReverseIntTest {
    @Test
    public void reverse() throws Exception {
        ReverseInt r = new ReverseInt();
        int result = r.reverse(123400);
        int expected = 4321;
        assertEquals(expected, result);

        ReverseInt r2 = new ReverseInt();
        int result2 = r2.reverse(1);
        int expected2 = 1;
        assertEquals(expected2, result2);

        ReverseInt r3 = new ReverseInt();
        int result3 = r3.reverse(638);
        int expected3 = 836;
        assertEquals(expected3, result3);
    }

    @Test
    public void reverse2() throws Exception {
        ReverseInt r = new ReverseInt();
        int result = r.reverse2(1234);
        int expected = 4321;
        assertEquals(expected, result);

        ReverseInt r2 = new ReverseInt();
        int result2 = r2.reverse2(1);
        int expected2 = 1;
        assertEquals(expected2, result2);

        ReverseInt r3 = new ReverseInt();
        int result3 = r3.reverse2(638);
        int expected3 = 836;
        assertEquals(expected3, result3);
    }

}