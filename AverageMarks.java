public class AverageMarks {
    public static void main(String[] args) {
        int [] physics = {90,78,56,78,90};
        int sum = 0;
        int count = 0;
        for(int element:physics){
            count+=1;
            sum+=element;
        }
        float average = (float) sum /count;
        System.out.println(average);
    }
}
