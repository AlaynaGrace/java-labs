/**
 * Created by alayn on 11/15/2016.
 */
public class Elevator {
    private int count;
    private Passenger[] passengers;
    public Elevator(){
        count = 0;
        passengers = new Passenger[10];
    }
    public boolean addPassenger(Passenger p){
        if(count==10){
            return false;
        }
        else{
            passengers[count] = p;
            count++;
            return true;
        }
    }
    public int getCount(){
        return count;
    }
    public Passenger[] removePassengersAtFloor(int floor){
        int j = 0;
        int c = 0;
        for(int i = 0; i<passengers.length; i++){
            if(passengers[i].getDropoffFloor() == floor){
                c++;
            }
        }
        Passenger[] p = new Passenger[c];
        for(int i = 0; i<passengers.length; i++){
            if(passengers[i].getDropoffFloor() == floor){
                p[j] = passengers[i];
                passengers[i] = null;
                count--;
                j++;
            }
        }



        return p;
    }
    public boolean isFull() {
        if(count == 10){
            return true;
        }
        else{
            return false;
        }
    }
}
