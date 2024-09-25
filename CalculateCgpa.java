import java.util.Scanner;
public class CalculateCgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1: ");
        float sub1 = sc.nextInt();
        System.out.println("Enter the marks of subject2: ");
        float sub2 = sc.nextInt();
        System.out.println("Enter the marks of subject3: ");
        float sub3 = sc.nextInt();
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println("The cgpa is "+cgpa);
    }
}
