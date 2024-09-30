import java.util.Scanner;
public class StudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for subject1: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks for subject2: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks for subject3: ");
        int sub3 = sc.nextInt();
        float avg = (sub1+sub2+sub3)/3f;
        if(sub1>33){
            if(sub2>33){
                if (sub3>33){
                    System.out.println("Student has qualified exam");
                }
            }else if(avg>48){
                System.out.println("Student has qualified exam");
            }
        }else {
            System.out.println("Student has failed");
        }
    }
}
