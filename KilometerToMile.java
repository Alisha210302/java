import java.util.Scanner;
public class KilometerToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in kilometers: ");
        float kilometer = sc.nextFloat();
        float miles = (float) (kilometer*0.621);
        System.out.println("The "+kilometer+" km is converted to "+miles+" miles.");
    }
}
