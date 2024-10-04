public class ForEach {
    public static void main(String[] args) {
        int [] marks = {10,20,30,40,50};
        System.out.println(marks.length);
//        float [] marks1 = {12.3f,45.6f,67.9f,45.3f,2.3f};
//        System.out.println(marks1.length);
//        String [] students = {"Alisha","Arya","Rutuja","Aditya","Atharva"};
//        System.out.println(students.length);

        // displaying an array (using for loop)
        System.out.println("Printing using for loop: ");
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // displaying an array (using for loop in reverse order)
        System.out.println("Printing in reverse order: ");
        for(int i = marks.length-1 ;i>=0;i--){
            System.out.println(marks[i]);
        }

        // displaying an array(using for each loop)
        System.out.println("Using for each loop: ");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
