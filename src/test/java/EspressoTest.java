import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EspressoTest {
    private Beverage espresso;

    @Before
    public void setUp() {
        espresso = new Espresso();
    }

    @Test
    public void testCost() {
        assertEquals(1.99f, espresso.cost(), 0);
    }

    @Test
    public void testDescription() {
        assertEquals("Espresso", espresso.getDescription());
    }
}
