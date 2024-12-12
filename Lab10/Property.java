/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class Property {

    private static int numberOfProperties = 0;
    private final int id;
    private String description;
    private double price;
    
    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) {
        this.id = numberOfProperties++;
        this.setDescription(description);
        this.setPrice(price);
    }

    /**
     * Id selector.
     */
    public int getId() {
        return id;
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {
        if(description == null){
            System.out.println("Description must not be null.");
        }
        this.description = description;
    }

    /**
     * Price selector.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Price must be positive.");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "description: " + this.description + "price: " + this.price;
    }
    
    @Test
    public void testtoString(){
        Property property = new Property("T3 Monte Belo", 150000);
        String expected = "description: T3 Monte Belo price: 15000";
        assertEquals(expected, property.toString());
    }
}