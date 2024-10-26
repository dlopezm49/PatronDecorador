import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SoyTest {
    private Beverage beverageWithSoy;

    @Before
    public void setUp() {
        Beverage darkRoast = new DarkRoast();
        beverageWithSoy = new Soy(darkRoast);
    }

    @Test
    public void testCost() {
        assertEquals(1.29f, beverageWithSoy.cost(), 0);
    }

    @Test
    public void testDescription() {
        assertEquals("Dark Roast Coffee, Soy", beverageWithSoy.getDescription());
    }
}
