package ex_03_Java_Array;

public class Lab003_MaxNo_InArray {
    public static void main(String[] args) {
        int arr[]= {12,76,98,23,56,74};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Maximum value in array is: "+max);
    }
}
