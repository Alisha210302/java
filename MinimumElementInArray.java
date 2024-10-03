public class MinimumElementInArray {
    public static void main(String[] args) {
        int [] arr = {12,23,45,12,21,56,78};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
