public class Strings {
    public static void main(String[] args) {
        String name = "Alisha";
        System.out.print("The name is "); // here only print so does not add space
        System.out.println(name); // here space is added at end
        int a = 12;
        float b = 12.3456f;
        System.out.printf("The value of a is %d and b is %8.2f ",a,b);
        System.out.println(" ");
        System.out.format("The value of a is %d and b is %f",a,b);

    }
}
