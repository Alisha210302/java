// Define a public class named NewDate
public class NewDate {

    // Instance variables to store day, month, and year
    private int day;           // An integer to hold the day of the month
    private Months month;      // An instance of the Months enum to hold the month
    private int year;          // An integer to hold the year

    // Method to set the day, with validation
    public void setDay(int day) {
        // Check if the provided day is valid
        if (day < 0) {
            System.out.println("Invalid"); // Print an error message if the day is negative
        } else {
            this.day = day; // Assign the valid day to the instance variable
        }
    }

    // Getter method for day
    public int getDay() {
        return day; // Return the day
    }

    // Method to set the month
    public void setMonth(Months month) {
        this.month = month; // Assign the provided month to the instance variable
    }

    // Getter method for month
    public Months getMonth() {
        return month; // Return the month
    }

    // Method to set the year
    public void setYear(int year) {
        this.year = year; // Assign the provided year to the instance variable
    }

    // Getter method for year
    public int getYear() {
        return year; // Return the year
    }

    // Override the toString method to provide a custom string representation of the NewDate object
    public String toString() {
        // Format the date as "day/month/year"
        return day + "/" + month + "/" + year;
    }
}
