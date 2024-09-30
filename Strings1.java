import java.util.Scanner;
public class Strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
//        String st = sc.next(); // it takes only first word
        String st = sc.nextLine(); // it takes the whole line
        System.out.println(st);
    }


}
