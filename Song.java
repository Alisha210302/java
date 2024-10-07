// Define a public class named Song that extends the Media class
public class Song extends Media {

    // Private fields for the song's serial number and title
    private int srno;
    private String title;

    // Constructor to initialize the Song object with a serial number and title
    public Song(int srno, String title) {
        this.title = title; // Assign the title to the field
        this.srno = srno;   // Assign the serial number to the field
    }

    // Override the toString method to provide a string representation of the Song object
    @Override
    public String toString() {
        return "Song [srno=" + srno + ", title=" + title + "]"; // Return formatted string with serial number and title
    }

    // Override the play method from the Media class
    @Override
    public void play() {
        System.out.println("Song is playing"); // Print a message indicating the song is playing
    }
}
