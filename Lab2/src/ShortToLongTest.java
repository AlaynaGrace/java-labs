import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alayn on 9/23/2016.
 */
public class ShortToLongTest {

    @Test
    public void full() throws Exception {
        ShortToLong s1 = new ShortToLong("$1234.50");
        s1.separate();
        s1.firstPart();
        s1.secondPart();
        String result = s1.full(s1);
        String expected = "one thousand two hundred thirty four 50/100 dollar(s)";
        assertEquals(expected, result);

        ShortToLong s2 = new ShortToLong("$10000.00");
        s2.separate();
        s2.firstPart();
        String r2 = s2.full(s2);
        String e2 = "ten thousand 00/100 dollar(s)";
        assertEquals(e2, r2);

        ShortToLong s3 = new ShortToLong("$1000000.00");
        s3.separate();
        s3.firstPart();
        String r3 = s3.full(s3);
        String e3 = "one million 00/100 dollar(s)";
        assertEquals(e3, r3);

        ShortToLong s4 = new ShortToLong("$45667.89");
        s4.separate();
        s4.firstPart();
        s4.secondPart();
        String r4 = s4.full(s4);
        String e4 = "forty five thousand six hundred sixty seven 89/100 dollar(s)";
        assertEquals(e4, r4);

        ShortToLong s5 = new ShortToLong("$1.00");
        s5.separate();
        s5.firstPart();
        s5.secondPart();
        String r5 = s5.full(s5);
        String e5 = "one 00/100 dollar(s)";
        assertEquals(e5, r5);
    }

}