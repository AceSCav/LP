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
    Sell seller1;
    Sell seller2;
    Sell client1;
    Sell client2;
    
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
    
        @Test
    public void testtoString(){
        Property property = new Property("T3 Monte Belo", 150000);
        String expected = "description: T3 Monte Belo price: 15000";
        assertEquals(expected, property.toString());
    }
    
    public void testCreatSell(){
        Sell sell = company.createSell("sell2", client1, seller1, property);
        assertNotNull(sell);
        assertEquals("sell2", sell.getId());
        assertEquals(client1, sell.getClient());
        assertEquals(seller1, sell.getSeller());
        assertEquals(property, sell.getProperty());
    }
    

}