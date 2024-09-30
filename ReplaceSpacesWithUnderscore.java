import java.util.Scanner;
public class ReplaceSpacesWithUnderscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        System.out.println("Before replacement: "+s);
        System.out.println("After replacement: "+s.replace(' ','_'));


    }



}
