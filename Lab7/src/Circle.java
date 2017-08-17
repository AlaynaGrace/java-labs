/**
 * Created by alayn on 10/25/2016.
 */
public class Circle implements Shape{
    private double radius;
    private double area;
    public Circle(double r){
        radius = r;
        area = Math.PI * radius * radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double getHeight() {
        return 2 * radius;
    }

    @Override
    public double getWidth() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getShapeType() {
        return "Circle";
    }
    public String toString(){
        return "Circle with radius " + radius;
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
