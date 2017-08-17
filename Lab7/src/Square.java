/**
 * Created by alayn on 10/25/2016.
 */
public class Square extends Rectangle {
    public Square(double side){
        super.height = side;
        super.length = side;
        super.area = length * height;
    }
    public String getShapeType(){
        return "Square";
    }
    public String toString(){
        return "Square with side length " + length;
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
