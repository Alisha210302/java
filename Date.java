// Define a public class named Date
public class Date {

    // Private instance variables to store the day, month, and year
    private int day;          // An integer to hold the day of the month
    private String month;     // A String to hold the name of the month
    private int year;         // An integer to hold the year

    // Constructor for the Date class that initializes the day, month, and year
    public Date(int d, String m, int y) {
        this.day = d;       // Assign the provided day to the instance variable
        this.month = m;     // Assign the provided month to the instance variable
        this.year = y;      // Assign the provided year to the instance variable
    }

    // Override the toString method to provide a custom string representation of the Date object
    public String toString() {
        // Return a formatted string representing the date in the format "day/month/year"
        return day + "/" + month + "/" + year;
    }
}
