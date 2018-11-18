import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING347);
        flight = new Flight(plane,"FR756", "GLA", "EDI", "14:00" );
        passenger1 = new Passenger("Gil", 2);
        passenger2 = new Passenger("Joe", 1);
        passenger3 = new Passenger("Blogs", 0);


    }

    @Test

    public void hasPlane(){
        assertEquals(plane, flight.getPlane());

    }

    @Test
    public void hasFlightNum(){
        assertEquals("FR756", flight.getFlightNumber());

    }

    @Test
    public void hasDest(){
        assertEquals("GLA", flight.getFlightDest());
    }

    @Test
    public void hasDep(){
        assertEquals("EDI", flight.getDep());

    }

    @Test
    public void hasDepTime(){
        assertEquals("14:00", flight.getDepTime());
    }

    @Test
    public void hasNoPassengers(){
        assertEquals(0, flight.passengerCount());

    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerCount());

    }


    @Test
    public void canRemovePassenger(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.removePassenger(passenger3);
        assertEquals(2, flight.passengerCount());

    }


}



