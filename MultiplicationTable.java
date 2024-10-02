import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print the table of: ");
        int table = sc.nextInt();
            for(int i = 1;i<=10;i++)
            {
                int num = table*i;
                System.out.println(num);
            }
    }
}
