import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseBlendTest {
    private Beverage houseBlend;

    @Before
    public void setUp() {
        houseBlend = new HouseBlend();
    }

    @Test
    public void testCost() {
        assertEquals(0.89f, houseBlend.cost(), 0);
    }

    @Test
    public void testDescription() {
        assertEquals("House Blend Coffee", houseBlend.getDescription());
    }
}
