import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alayn on 9/20/2016.
 */
public class Complex3Test {

    @org.junit.Test
    public void setRealPart() throws Exception {
        Complex3 c = new Complex3(3,3);
        c.setRealPart(6);
        double result = c.getRealPart();
        double expected = 6;
        assertEquals(expected, result, 0.01);

    }

    @org.junit.Test
    public void setImaginaryPart() throws Exception {
        Complex3 c = new Complex3(3,3);
        c.setImaginaryPart(5);
        double result = c.getImaginaryPart();
        double expected = 5;
        assertEquals(expected, result, 0.01);
    }

    @org.junit.Test
    public void getRealPart() throws Exception {
        Complex3 c = new Complex3(3,3);
        double result = 3;
        double expected = 3;
        assertEquals(expected, result);
    }

    @org.junit.Test
    public void getImaginaryPart() throws Exception {
        Complex3 c = new Complex3(3,3);
        double result = 3;
        double expected = 3;
        assertEquals(expected, result);
    }

    @org.junit.Test
    public void addComplex() throws Exception {
        Complex3 c1 = new Complex3(3,3);
        Complex3 c2 = new Complex3(2,2);
        c1.addComplex(c2);
        double resultReal = c1.getRealPart();
        double expectedReal = 5;
        double resultImaginary = c1.getImaginaryPart();
        double expectedImaginary = 5;
        assertEquals(expectedReal, resultReal, 0.01);
        assertEquals(expectedImaginary, resultImaginary, 0.01);



    }

    @org.junit.Test
    public void subtractComplex() throws Exception {
        Complex3 c1 = new Complex3(3,3);
        Complex3 c2 = new Complex3(2,2);
        c1.subtractComplex(c2);
        double resultReal = c1.getRealPart();
        double expectedReal = 1;
        double resultImaginary = c1.getImaginaryPart();
        double expectedImaginary = 1;
        assertEquals(expectedReal, resultReal, 0.01);
        assertEquals(expectedImaginary, resultImaginary, 0.01);

    }

}