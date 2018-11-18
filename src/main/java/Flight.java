import java.util.ArrayList;

public class Flight {

    private Plane plane;
        private String flightNumber;
        private String destination;
        private String departure;
        private String departureTime;
        private ArrayList<Passenger>passengers;

        public Flight(Plane plane, String flightNumber, String destination, String departure, String departureTime){
            this.plane = plane;
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departure = departure;
            this.departureTime = departureTime;
            this.passengers = new ArrayList<Passenger>();

        }


    public Plane getPlane() {
            return plane;
    }

    public String getFlightNumber() {
            return flightNumber;
    }

    public String getFlightDest() {
            return destination;
    }

    public String getDep() {
            return departure;
    }
    public String getDepTime(){
            return departureTime;

    }

    public  int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger){
            this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger3) {
            this.passengers.remove(2);
    }
}
