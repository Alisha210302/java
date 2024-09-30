public class DetectDoubleAndTripleSpaces {
    public static void main(String[] args) {
        // here if output is -1 then it does not have the spaces in it
        String myString = "Have a  good   day";
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("  "));

    }
}
