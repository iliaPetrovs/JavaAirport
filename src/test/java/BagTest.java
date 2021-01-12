import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BagTest {
    @Test
    public void doesConstructCorrectly() {
        Bag bag = new Bag(5);
        assertEquals(bag.weight, 5);
    }
}
