package ex_03_Java_Array;

public class Lab001_SumOfNumber {
    public static void main(String[] args) {
        int[] arr = {23,76,11};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum of array is: "+ sum);

    }
}
