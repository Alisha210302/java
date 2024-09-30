public class Logical {
    public static void main(String[] args) {
        Boolean b1 = true;
        Boolean b2 = false;
        if(b1 && b2){
            System.out.println("It is true");
        }
        else {
            System.out.println("It is not true");
        }
        if(b1 || b2){
            System.out.println("Any one is true");
        }
        else {
            System.out.println("Both are false");
        }
        System.out.print("Not of b1 is:");
        System.out.println(!b1);
    }
}
