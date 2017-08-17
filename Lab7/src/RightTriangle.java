/**
 * Created by alayn on 10/25/2016.
 */
public class RightTriangle implements Shape {
    private double height;
    private double width;
    private double area;
    public RightTriangle(double h, double w){
        height = h;
        width = w;
        area = width * height * 0.5;
    }
    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt((height*height) + (width*width));
        return 2 * side + width;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getShapeType() {
        return "Right triangle";
    }
    public String toString(){
        return "Right triangle with width " + width + " and height " + height;
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
