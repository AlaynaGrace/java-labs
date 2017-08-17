import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alayn on 9/13/2016.
 */
public class RectangleTest {
    @Test
    public void perimeter() throws Exception {
        Rectangle myRect = new Rectangle(2,3);
        double result = myRect.perimeter();
        double expected = 10;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void setLength() throws Exception {
        Rectangle myRect = new Rectangle(2,3);
        //void result = myRect.setLength(4);
        //void expected = 4;
        //assertEquals(expected, result);
    }

    @Test
    public void setWidth() throws Exception {
        Rectangle myRect = new Rectangle(2,3);
        //double result = myRect.setWidth(5.0);
        //double expected = 5.0;
        //assertEquals(expected, result, 0.01);
    }

    @Test
    public void getLength() throws Exception {
        Rectangle myRect = new Rectangle(2,3);
        double result = myRect.getLength();
        double expected = 2.0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void getWidth() throws Exception {
        Rectangle myRect = new Rectangle(2,3);
        double result = myRect.getWidth();
        double expected = 3.0;
        assertEquals(expected, result, 0.01);
    }

    @org.junit.Test
    public void area() throws Exception {
        Rectangle myRect = new Rectangle(2,3);
        double result = myRect.area();
        double expected = 6.0;
        assertEquals(expected, result, 0.01);

    }

}