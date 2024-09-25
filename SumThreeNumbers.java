import java.util.Scanner;
public class SumThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the num2: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter the num3: ");
        float num3 = sc.nextFloat();
        float sum = num1+num2+num3;
        System.out.println("Sum is: "+sum);
    }
}
