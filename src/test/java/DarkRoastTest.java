import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DarkRoastTest {
    private Beverage darkRoast;

    @Before
    public void setUp() {
        darkRoast = new DarkRoast();
    }

    @Test
    public void testCost() {
        assertEquals(0.99f, darkRoast.cost(), 0);
    }

    @Test
    public void testDescription() {
        assertEquals("Dark Roast Coffee", darkRoast.getDescription());
    }
}
