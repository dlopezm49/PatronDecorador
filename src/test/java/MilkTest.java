import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MilkTest {
    private Beverage beverageWithMilk;

    @Before
    public void setUp() {
        Beverage espresso = new Espresso();
        beverageWithMilk = new Milk(espresso);
    }

    @Test
    public void testCost() {
        assertEquals(2.49f, beverageWithMilk.cost(), 0);
    }

    @Test
    public void testDescription() {
        assertEquals("Espresso, Milk", beverageWithMilk.getDescription());
    }
}
