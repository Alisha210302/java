public class ArraySortedOrNot {
    public static void main(String[] args) {
        int [] arr = {12,21,1,23,45,67,87};
        int sorted = arr[0];
        int t = 0;
        for(int i=0;i<arr.length;i++){
            if(sorted>arr[i]){
                 t = 1;
                 break;
            }
            else {
                 t = 0;
            }
        }
        if(t==1){
            System.out.println("Array is not sorted.");
        }
        else {
            System.out.println("Array is sorted.");
        }
    }
}
