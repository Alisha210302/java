public class StringMethods {
    public static void main(String[] args) {
        String name = "Alisha";
        System.out.println(name);

        int length = name.length(); // to find length of string
        System.out.println(length);

        String lstring = name.toLowerCase(); // to convert string to lowercase
        System.out.println(lstring);

        String ustring = name.toUpperCase(); // to convert string to uppercase
        System.out.println(ustring);

        String nonTrimmedString ="       Alisha        ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim()); // to remove whitespaces

        System.out.println(name.substring(2)); // returns string starting from given index
        System.out.println(name.substring(2,5)); // begin index included but last index is excluded

        System.out.println(name.replace('a','r')); // to replace a character in string
        System.out.println(name.replace("Ali","ali")); // to replace a string with a string

        System.out.println(name.startsWith("Ali")); // if string starts with passed value returns true else false
        System.out.println(name.endsWith("sha")); // if string ends with passed value returns true else false

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("A"));
        System.out.println(name.lastIndexOf('a',5));
        System.out.println(name.equals("Alisha")); // to check if two strings are equal
        System.out.println(name.equalsIgnoreCase("alisha"));

        System.out.println("\"Hello\tWorld\""); // escape sequence

    }

}
