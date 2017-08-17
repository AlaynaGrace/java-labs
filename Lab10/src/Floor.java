/**
 * Created by alayn on 11/15/2016.
 */
public class Floor {
    N n, start;
    int length;
    private int floorNum;
    public Floor(int floor){
        N start = new N();
        n = start;
        length = 0;
        floorNum = floor;
    }
    public boolean isEmpty(){
        if(length ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int getFloorNum(){
        return floorNum;
    }
    public void add(Passenger p){
        if(p == null){
            RuntimeException e = new RuntimeException("Object is null");
            throw e;
        }
        else {
            n.setNext(new N(p, null));
            n = n.getNext();
            System.out.println("Passenger Added to floor " + floorNum);
            length++;
        }
    }
    public Passenger remove(){
        if(length == 0){
            throw new RuntimeException("Stack is empty");
        }
        else {
            N temp = start.getNext();
            start.setNext(start.getNext().getNext());
            return (Passenger) temp.getData();
        }
    }
}
