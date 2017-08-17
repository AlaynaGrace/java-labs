/**
 * Created by alayn on 11/15/2016.
 */
public class Passenger {
    private int pickup;
    private int dropoff;
    public int getPickupFloor(){
        return pickup;
    }
    public int getDropoffFloor(){
        return dropoff;
    }
    public Passenger(int pickupFloor){
        pickup = pickupFloor;
        int d = (int) Math.ceil(Math.random() * 5);
        while(d == pickup){
            d = (int) Math.ceil(Math.random() * 5);
        }
        dropoff = d;

    }

}
