import java.util.ArrayList; // Importing ArrayList for dynamic array implementation
import java.util.List; // Importing List interface
import java.util.stream.Collectors; // Importing stream functionalities (though not used in current methods)

// Define the Stock class that manages a list of Toy objects
public class Stock {

    // Private list to hold Toy objects
    private List<Toy> toylist;

    // Constructor to initialize the toylist
    public Stock() {
        toylist = new ArrayList<>(); // Instantiate the ArrayList
    }

    // Method to add a Toy to the stock
    public void addToy(Toy toy) {
        toylist.add(toy); // Add the toy to the list
    }

    // Method to list all toys in stock
    public void liststock() {
        for (Toy toy : toylist) {
            System.out.println(toy); // Print each toy's details
        }
    }

    // Method to filter toys by category
    public void filterByCategory(String category) {
        List<Toy> toysInRange = new ArrayList<>(); // Create a new list to hold filtered toys

        for (Toy toy : toylist) {
            if (toy.getCategory().equals(category)) {
                toysInRange.add(toy); // Add toy to the filtered list if the category matches
            }
        }

        for (Toy toy : toysInRange) {
            System.out.println(toy); // Print filtered toys
        }
    }

    // Method to search for a toy by its ID
    public void searchToy(int id) {
        List<Toy> idList = new ArrayList<>(); // List to hold toys with matching ID

        for (Toy toy : toylist) {
            if (toy.getId() == id) {
                idList.add(toy); // Add toy to the list if the ID matches
            }
        }

        for (Toy toy : idList) {
            System.out.println(toy); // Print found toys
        }
    }

    // Method to list toys within a specified price range
    public void listToyByPriceRange(double minPrice, double maxPrice) {
        List<Toy> toysInRange = new ArrayList<>(); // List to hold toys in the price range

        for (Toy toy : toylist) {
            if (toy.getPrice() >= minPrice && toy.getPrice() <= maxPrice) {
                toysInRange.add(toy); // Add toy to the list if it's within the price range
            }
        }

        for (Toy toy : toysInRange) {
            System.out.println(toy); // Print toys in the specified price range
        }
    }

    // Method to list toys suitable for a specified age group
    public void listToysByAge(int age) {
        List<Toy> toysByAge = new ArrayList<>(); // List to hold toys for the specified age

        for (Toy toy : toylist) {
            if (toy.getAge() == age) {
                toysByAge.add(toy); // Add toy if the age matches
            }
        }

        for (Toy toy : toysByAge) {
            System.out.println(toy); // Print toys for the specified age
        }
    }

    // Method to sort toys by price, rating, and ID
    public void sortByPriceRatingId(float price, int rating, int id) {
        List<Toy> toys = new ArrayList<>(); // List to hold toys that match the criteria

        for (Toy toy : toylist) {
            if (toy.getPrice() == price && toy.getRating() == rating && toy.getId() == id) {
                toys.add(toy); // Add toy if it matches price, rating, and ID
            }
        }

        for (Toy toy : toys) {
            System.out.println(toy); // Print toys that match the criteria
        }
    }
}
