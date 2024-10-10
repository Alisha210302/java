public class Video extends Media {

    // Instance variables
    private int srno;               // Serial number of the video
    private StringInterface title;  // Title of the video, using the StringInterface

    // Constructor to initialize a Video object
    public Video(int srno, StringInterface title) {
        this.srno = srno;
        this.title = title;
    }

    // Override toString method to provide a string representation of the Video object
    @Override
    public String toString() {
        return "Video [srno=" + srno + ", title=" + title + "]";
    }

    // Method to simulate playing the video
    @Override
    public void play() {
        System.out.println("Video is playing");
    }
}
