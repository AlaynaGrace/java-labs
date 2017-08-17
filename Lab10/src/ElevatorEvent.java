/**
 * Created by alayn on 11/15/2016.
 */
public class ElevatorEvent implements Event{
    private Elevator elevator;
    private int floor;
    public ElevatorEvent(Elevator elevator, int floor){
        this.elevator = elevator;
        this.floor = floor;
    }

    @Override
    public void run() {
        int f = floor;
//        if (elevator.isFull() || ElevatorSim.floor[floor - 1].isEmpty()) {
//            elevator.removePassengersAtFloor(floor);
//            while (elevator.getCount() < 10 || !ElevatorSim.floor[floor - 1].isEmpty()) {
//                elevator.addPassenger(ElevatorSim.floor[floor - 1].remove());
//            }
//
//        } else {
//            while (elevator.getCount() < 10 || !ElevatorSim.floor[floor - 1].isEmpty()) {
//                elevator.addPassenger(ElevatorSim.floor[floor - 1].remove());
//            }
            System.out.println(floor);
            if (f < 5) {
                f++;
            } else {
                f = 1;
            }
            ElevatorEvent e = new ElevatorEvent(elevator, f);


            ElevatorSim.agenda.add(e, 10);
        }
    }
//}
