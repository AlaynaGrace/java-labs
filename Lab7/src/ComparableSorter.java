/**
 * Created by alayn on 10/25/2016.
 */
public class ComparableSorter<T extends Comparable<T>> {
    public void sort(T[] stuff){
        //selection sort
        int i,j, minIndex;
        T temp;
        int counter =0;
        for(i=0; i<stuff.length-1; i++) {
            minIndex = i;
            for (j = i + 1; j < stuff.length; j++) {
                if (stuff[i].compareTo(stuff[j]) > 0) {
                    minIndex = j;
                }
            }
            temp = stuff[minIndex];
            stuff[minIndex] = stuff[i];
            stuff[i] = temp;
        }
    }

    public static void main(String[] args) {
        RightTriangle rT = new RightTriangle(3,4);//1
        Rectangle rect = new Rectangle(2,10);//3
        Square sqr = new Square(4);//2
        Circle circ = new Circle(7);//4
        Shape[] s = {sqr, rT, circ, rect};
        ComparableSorter<Shape> c = new ComparableSorter<Shape>();
        c.sort(s);
        for(int i = 0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}
