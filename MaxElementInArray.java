public class MaxElementInArray {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55};
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("Max element is: ");
        System.out.println(max);
    }
}
