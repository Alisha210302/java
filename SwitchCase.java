import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: ");
       int choice = sc.nextInt();
       // choice can be integer, character or string in java

       switch (choice){
           case 1:
               System.out.println("Choice is 1");
               break;
           case 2:
               System.out.println("Choice is 2");
               break;
           case 3:
               System.out.println("Choice is 3");
               break;
           case 4:
               System.out.println("Choice is 4");
               break;
           default:
               System.out.println("Default choice");
       }
    }
}
