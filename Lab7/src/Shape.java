/**
 * Created by alayn on 10/25/2016.
 */
public interface Shape extends Comparable<Shape>{
    double getHeight();
    double getWidth();
    double getPerimeter();
    double getArea();
    String getShapeType();
    int compareTo(Shape s);
}
