import java.util.Scanner;
public class GivenIntegerInArrayOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,9};
        Scanner sc = new Scanner(System.in);
        boolean var = false;
        System.out.println("Enter the number you want to find: ");
        int n = sc.nextInt();
        for(int element:arr){
            if (element==n){
                 var = true;
                 break;
            }
        }
        if (var){
            System.out.println("Number is present.");
        }
        else {
            System.out.println("Number is not present.");
        }
    }
}
