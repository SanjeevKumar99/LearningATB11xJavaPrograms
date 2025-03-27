package ex_03_Java_Array;

public class Lab002_ReverseArrayElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int i=arr.length-1; i>=0; i--){
            int reverse=arr[i];
            System.out.println(reverse);
        }

    }
}
