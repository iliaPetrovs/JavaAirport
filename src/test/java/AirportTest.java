import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AirportTest {
    Airport lhw = new Airport("LHW");
    Plane oceanic = new Plane("Oceanic 815");
    Passenger john = new Passenger("John");
    Passenger jack = new Passenger("Jack");
    Bag johnBag = new Bag(5);
    Bag jackBag = new Bag(12);
    @Test
    public void doesConstructCorrectly() {
        Airport lhw = new Airport("LHW");
        assertEquals(lhw.airportName, "LHW");
    }
    @Test
    public void doAllClassesInteractCorrectly() {
        john.addBag(johnBag);
        jack.addBag(jackBag);
        oceanic.boardPassenger(john);
        oceanic.boardPassenger(jack);
        lhw.addPlane(oceanic);
        assertEquals(lhw.planes[0].passengers[0].bags[0].weight, 5);
    }
}
