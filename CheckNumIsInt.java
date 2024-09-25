import java.util.Scanner;
public class CheckNumIsInt {
    public static void main(String[] args) {
        System.out.println("Enter the number to check: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }

}
