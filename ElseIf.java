import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are eligible for college");
        }
        else if(age>5){
            System.out.println("You are eligible for school");
        }
        else {
            System.out.println("you are not eligible.");
        }
    }
}
