import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PassengerTest {
    @Test
    public void doesConstructCorrectly() {
        Passenger john = new Passenger("John");
        assertEquals(john.name, "John");
    }
}
