import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alayn on 9/27/2016.
 */
public class MaxTest {
    @Test
    public void maxDigit2() throws Exception {
        Max m2 = new Max();
        int result = m2.maxDigit2(14);
        int expected = 4;
        assertEquals(expected, result);

        Max m3 = new Max();
        int result3 = m3.maxDigit2(720);
        int expected3 = 7;
        assertEquals(expected3, result3);

        Max m4 = new Max();
        int result4 = m4.maxDigit2(86942);
        int expected4 = 9;
        assertEquals(expected4, result4);
    }

}