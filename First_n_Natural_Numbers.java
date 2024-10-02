import java.util.Scanner;
public class First_n_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to print the natural numbers: ");
        int a = 1;
        int n = sc.nextInt();
        do{
            System.out.println(a);
            a++;
        }while (a<=n);
    }
}
