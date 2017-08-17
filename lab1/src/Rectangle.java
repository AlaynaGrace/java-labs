/**
 * Created by alayn on 9/13/2016.
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        double area = length * width;
        return area;
    }
    public double perimeter(){
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }
    public void setLength(double newLength){
        length = newLength;
    }
    public void setWidth(double newWidth){
        width = newWidth;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}
