import java.util.Scanner; // need to import this if you want to take the input
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from scanner: ");
        Scanner sc = new Scanner(System.in); // made object of scanner class
        System.out.println("Enter number 1: ");
//        int a = sc.nextInt(); // used it here for taking input from the user
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
//        int sum1 = a+b;
        float sum1 = a+b;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum1);
        boolean b1 = sc.hasNextInt();  // checks whether the input is integer or not
        System.out.println(b1);
        //String str = sc.next(); // taking input as a string
        String str = sc.nextLine(); // taking input as a string (sentence)
        System.out.println(str);

    }
}
