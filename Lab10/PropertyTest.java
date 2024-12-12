

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    /**
     * Default constructor for test class PropertyTest
     */
    Property property1;
    public PropertyTest()
    {
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000, property1.getPrice(), 0.01);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        property1 = new Property("T3 Monte Belo", 150000);
    }
}
