/**
 * Created by alayn on 9/13/2016.
 */
public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double perimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    public double area(){
        double area = radius * radius * Math.PI;
        return area;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public double getRadius(){
        return radius;
    }
}
