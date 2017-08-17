import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alayn on 9/20/2016.
 */
public class RationalTest {
    @Test
    public void getNumerator() throws Exception {
        Rational rat = new Rational(1,2);
        int result = rat.getNumerator();
        int expected = 1;
        assertEquals(expected, result);

    }

    @Test
    public void getDenominator() throws Exception {
        Rational rat = new Rational(1,2);
        int result = rat.getDenominator();
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void setNumerator() throws Exception {
        Rational rat = new Rational(1,2);
        rat.setNumerator(2);
        int result = rat.getNumerator();
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void setDenominator() throws Exception {
        Rational rat = new Rational(1,2);
        rat.setDenominator(3);
        int result = rat.getDenominator();
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void addRational() throws Exception {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(2,1);
        r1.addRational(r2);
        int resultNum = r1.getNumerator();
        int resultDen = r1.getDenominator();
        int expectedNum = 5;
        int expectedDen = 2;
        assertEquals(expectedNum, resultNum);
        assertEquals(expectedDen, resultDen);

    }

    @Test
    public void subRational() throws Exception {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(2,1);
        r1.subRational(r2);
        int resultNum = r1.getNumerator();
        int resultDen = r1.getDenominator();
        int expectedNum = -3;
        int expectedDen = 2;
        assertEquals(expectedNum, resultNum);
        assertEquals(expectedDen, resultDen);
    }

    @Test
    public void mulRational() throws Exception {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(2,1);
        r1.mulRational(r2);
        int resultNum = r1.getNumerator();
        int resultDen = r1.getDenominator();
        int expectedNum = 2;
        int expectedDen = 2;
        assertEquals(expectedNum, resultNum);
        assertEquals(expectedDen, resultDen);
    }

    @Test
    public void divRational() throws Exception {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(2,1);
        r1.divRational(r2);
        int resultNum = r1.getNumerator();
        int resultDen = r1.getDenominator();
        int expectedNum = 1;
        int expectedDen = 4;
        assertEquals(expectedNum, resultNum);
        assertEquals(expectedDen, resultDen);
    }

}