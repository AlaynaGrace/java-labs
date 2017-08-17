/**
 * Created by alayn on 11/15/2016.
 */
public class PassengerEvent implements Event{
    private Floor floor;

    PassengerEvent(Floor floor){
        this.floor = floor;
    }
    public int intRandomInterval(int low, int high) {
        return (int) Math.floor((high - low) * Math.random() + low + 0.5);
    }
    @Override
    public void run() {
        int arrival = intRandomInterval(20,30);
        ElevatorSim.agenda.add(new PassengerEvent(floor), arrival);
        ElevatorSim.floor[floor.getFloorNum()-1].add(new Passenger(floor.getFloorNum()));
    }
}
