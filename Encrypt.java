import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = 'A';
        // encryption
        grade = (char) (grade+8);
        System.out.println(grade);

        // decryption
        grade = (char) (grade-8);
        System.out.println(grade);



    }


}
