public class SumOfNumbersInTable {
    public static void main(String[] args) {
        int table = 8;
        int sum=0;
        for(int i =1;i<=10;i++){
            int result = table*i;
            sum+=result;
        }
        System.out.println(sum);
    }
}
