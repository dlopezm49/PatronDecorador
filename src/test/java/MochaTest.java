import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MochaTest {
    private Beverage beverageWithMocha;

    @Before
    public void setUp() {
        Beverage houseBlend = new HouseBlend();
        beverageWithMocha = new Mocha(houseBlend);
    }

    @Test
    public void testCost() {
        assertEquals(1.09f, beverageWithMocha.cost(), 0);
    }

    @Test
    public void testDescription() {
        assertEquals("House Blend Coffee, Mocha", beverageWithMocha.getDescription());
    }
}
