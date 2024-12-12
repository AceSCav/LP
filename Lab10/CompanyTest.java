

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    private Company company;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;
    
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
    }

    @BeforeEach
    public void setUp() {
        company = new Company();

        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");

        company.registerClient(client1);
        company.registerClient(client2);
        company.registerSeller(seller1);
        company.registerSeller(seller2);
    }

    /**
     * Test the constructor of Company.
     */
    @Test
    public void testConstructor() {
        assertNotNull("Clients list should not be null", company.getClients());
        assertNotNull("Sellers list should not be null", company.getSellers());
        assertNotNull("Properties list should not be null", company.getProperties());
        assertNotNull("Sells list should not be null", company.getSells());
        assertEquals("Clients list should have 2 clients", 2, company.getClients().size());
        assertEquals("Sellers list should have 2 sellers", 2, company.getSellers().size());
    }
    
    @Test
    public void testRegisterClient() {
        User newClient = new User("Maria Silva", "933333333", "maria.silva@gmail.com");
        company.registerClient(newClient);
        assertEquals(3, company.getClients().size(), "Clients list should have 3 clients");
        assertTrue(company.getClients().contains(newClient), "Clients list should contain the new client");
    }
}