    
    import java.util.ArrayList;
    import java.time.LocalDate;
    import java.util.List;
    
    /**
     * Manage a company.
     *
     * @author POO
     * @version 03/2024
     */
    public class Company {
    
        // Clients registry
        private ArrayList<User> clients;
        // Sellers registry
        private ArrayList<User> sellers;
        // Properties registry
        private ArrayList<Property> properties;
        // Sells registry
        private ArrayList<Sell> sells;
    
        /**
         * Constructor of class Company
         */
        public Company() {
    
        }
    
        /**
         * Get the list of clients.
         *
         * @return This company clients.
         */
        public List<User> getClients() {
            return null;         // dummy implementation
        }
    
        /**
         * Get the list of sellers.
         *
         * @return This company sellers.
         */
        public List<User> getSellers() {
            return null;         // dummy implementation
        }
    
        /**
         * Get the list of properties.
         *
         * @return This company's properties.
         */
        public List<Property> getProperties() {
            return null;         // dummy implementation
        }
    
        /**
         * Get the list of sells.
         *
         * @return This company sells.
         */
        public List<Sell> getSells() {
            return null;         // dummy implementation
        }
    
        /**
         * Register a client.
         *
         * @param client to register. Must not be null. Must not be registered.
         * @return true If the registration succeeds, false otherwise.
         */
        public boolean registerClient(User client) {
            if (client != null && !this.clients.contains(client)) {
                this.clients.add(client);
                return true;
            }
            return false;
        }
    
        /**
         * Register a seller.
         *
         * @param seller to register. Must not be null. Must not be registered.
         * @return true If the registration succeeds, false otherwise.
         */
        public boolean registerSeller(User seller) {
            return true;         // dummy implementation
        }
    
        /**
         * Register a property.
         *
         * @param property to register. Must not be null. Must not be registered.
         * @return true If the registration succeeds, false otherwise.
         */
        public boolean registerProperty(Property property) {
            return true;         // dummy implementation
        }
    
        /**
         * Register a sell.
         *
         * @param sell to register. Must not be null. Must not be registered.
         * @return true If the registration succeeds, false otherwise.
         */
        public boolean registerSell(Sell sell) {
            return true;         // dummy implementation
        }
    
        /**
         * Generate a new sell and register that sell.
         *
         * @param client Must be already registered.
         * @param seller Must be already registered.
         * @param property Must be already registered.
         * @return true If the request succeeds, false otherwise.
         */
        public boolean createSell(User client, User seller, Property property) {
            if (client != null && this.clients.contains(client) && seller != null && this.sellers.contains(seller)) {
                if (property != null && this.properties.contains(property)) {
                    registerSell(new Sell(client, seller, property));
                    return true;
                }
            }
            return false;
        }
    
        
        
        /**
         * Display all clients.
         */
        public void showClients() {
            if (this.clients.isEmpty()) {
                System.out.println("\nA imobiliaria ainda não tem clientes adicionados.");
            } else {
                System.out.println("\nNúmero de clientes: " + this.clients.size());
                System.out.println("\n+++ Lista de clientes +++");
                for (User u : this.clients) {
                    u.show();
                }
                System.out.println();
            }
        }
    
        /**
         * Display all sellers.
         */
        public void showSellers() {
        }
    
        /**
         * Display all properties.
         */
        public void showProperties() {
        }
    
        /**
         * Display all sells.
         */
        public void showSells() {
        }
        
        
        
        /**
         * Calculates the total number of sells within the provided year.
         *
         * @param year
         * @return The total number of sells in the year.
         */
        public int calculateSellsOfTheYear(int year) {
            return 0;         // dummy implementation
        }
    
        /**
         * Find the seller with more sells within the provided year.
         *
         * @param year
         * @return The name of the seller of the year.
         */
        public String findSellerOfTheYear(int year) {
            return null;         // dummy implementation
        }
    
    }
