import java.util.Scanner;
public class ConvertToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to convert to lowercase: ");
        String s = sc.next();
        System.out.println("Before Conversion: "+s);
        System.out.println("After Conversion: "+s.toLowerCase());
    }
}
