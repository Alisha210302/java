// Define an enumeration named Flavour
public enum Flavour {

    // Enum constants with their associated prices
    CHOCOLATE(120), // Chocolate flavour with a price of 120
    MINT(100),      // Mint flavour with a price of 100
    CREAM(90);      // Cream flavour with a price of 90

    // Instance variable to hold the price of the flavour
    int price;

    // Constructor for the enum, which is private by default
    private Flavour(int price) {
        this.price = price; // Assign the provided price to the instance variable
    }

    // Method to get the price of the flavour
    public int getPrice() {
        return price; // Return the price of the flavour
    }
}
