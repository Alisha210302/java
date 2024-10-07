// Define a public class named EmptyStringException that extends Exception
public class EmptyStringException extends Exception {

    // Constructor that takes a message as a parameter
    public EmptyStringException(String message) {
        super(message); // Call the constructor of the superclass (Exception) with the message
    }
}
