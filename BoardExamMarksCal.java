import java.util.Scanner;
public class BoardExamMarksCal {
    public static void main(String[] args) {
        float outoff = 500;
        float total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1: ");
        float s1 = sc.nextFloat();
        System.out.println("Enter the marks of subject2: ");
        float s2 = sc.nextFloat();
        System.out.println("Enter the marks of subject3: ");
        float s3 = sc.nextFloat();
        System.out.println("Enter the marks of subject4: ");
        float s4 = sc.nextFloat();
        System.out.println("Enter the marks of subject5: ");
        float s5 = sc.nextFloat();
        total = s1+s2+s3+s4+s5;
        System.out.println(total);
        float percentage = (total/outoff)*100;
        System.out.println("Percentage is "+percentage);
    }


}
