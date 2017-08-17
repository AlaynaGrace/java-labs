/**
 * Created by alayn on 11/15/2016.
 */
public class ElevatorSim {
    public static PQ agenda = new PQ();
    public static Floor[] floor = {new Floor(1), new Floor(2), new Floor(3), new Floor(4), new Floor(5)};
    public static void main(String[] args) {
        PassengerEvent p1 = new PassengerEvent(floor[0]);
        PassengerEvent p2 = new PassengerEvent(floor[1]);
        PassengerEvent p3 = new PassengerEvent(floor[2]);
        PassengerEvent p4 = new PassengerEvent(floor[3]);
        PassengerEvent p5 = new PassengerEvent(floor[4]);

        Elevator elevator = new Elevator();
        ElevatorEvent e = new ElevatorEvent(elevator, 1);

        agenda.add(e, 10);
        agenda.add(p1, p1.intRandomInterval(20,30));
        agenda.add(p2, p2.intRandomInterval(20,30));
        agenda.add(p3, p3.intRandomInterval(20,30));
        agenda.add(p4, p4.intRandomInterval(20,30));
        agenda.add(p5, p5.intRandomInterval(20,30));

        while(agenda.getCurrentTime() <= 10000){
            agenda.remove().run();
        }
    }
}
