/**
 * Created by alayn on 9/13/2016.
 */
public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double area(){
        return base * height / 2;
    }
    public double perimeter(){
        double hyp = Math.sqrt(base*base + height*height);
        double perimeter = base + height + hyp;
        return perimeter;
    }
    public void setBase(double newBase){
        base = newBase;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
}
