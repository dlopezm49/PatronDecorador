import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecafTest {
    private Beverage decaf;

    @Before
    public void setUp() {
        decaf = new Decaf();
    }

    @Test
    public void testCost() {
        assertEquals(1.05f, decaf.cost(), 0);
    }

    @Test
    public void testDescription() {
        assertEquals("Decaf Coffee", decaf.getDescription());
    }
}
