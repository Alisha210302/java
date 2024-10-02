import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        System.out.println("Enter the number to find the factorial of: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            result = result*i;
        }
        System.out.println(result);
    }
}
