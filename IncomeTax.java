import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        float income = sc.nextFloat();
        if(500000>income && income>250000){
            float incomeTax = income*((float) 5 /100);
            System.out.print("The income tax is: "+incomeTax);
        }
        else if(1000000>income && income>=500000){
            float incomeTax = income*((float) 20 /100);
            System.out.print("The income tax is: "+incomeTax);
        }
        else if (1000000<income){
            float incomeTax = income*((float) 30 /100);
            System.out.print("The income tax is: "+incomeTax);
        }
        else {
            float incomeTax = 0f;
            System.out.println("The income tax is: "+incomeTax);
        }
    }
}
