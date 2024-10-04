public class Float_Array_sum {
    public static void main(String[] args) {
        float sum = 0;
        float [] arr = {12.3f,23.4f,67.8f,45.8f,34.5f};
        for(float element:arr){
            sum+=element;
        }
        System.out.println(sum);
    }
}
