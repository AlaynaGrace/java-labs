/**
 * Created by alayn on 10/25/2016.
 */
public class Rectangle implements Shape {
    protected double length;
    protected double height;
    protected double area;
    public Rectangle(){
        length = 0;
        height = 0;
        area = 0;
    }
    public Rectangle(double l, double h){
        length = l;
        height = h;
        area = length * height;
    }
    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWidth() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * height;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getShapeType() {
        return "Rectangle";
    }
    public String toString(){
        return "Rectangle with length " + length + " and height " + height;
    }
    public int compareTo(Shape s){
        int biggest = 0;
        if(area > s.getArea()){
            biggest = 1;
        }
        else{
            biggest = -1;
        }
        return biggest;
    }
}
