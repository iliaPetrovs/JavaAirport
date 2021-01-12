import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlaneTest {
    Plane oceanic = new Plane("Oceanic 815");
    Airport lhw = new Airport("LHW");
    @Test
    public void doesConstructCorrectly() {
        assertEquals(oceanic.flightNumber, "Oceanic 815");
    }
    @Test
    public void doesOriginAndDestinationSetCorrectly() {
        oceanic.setOrigin(lhw);
        oceanic.setDestination(lhw);
        assertEquals(oceanic.origin, lhw);
        assertEquals(oceanic.destination, lhw);
    }
}
