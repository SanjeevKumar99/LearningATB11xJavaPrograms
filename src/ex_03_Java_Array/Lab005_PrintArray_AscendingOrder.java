package ex_03_Java_Array;

import java.util.Arrays;

public class Lab005_PrintArray_AscendingOrder {
    public static void main(String[] args) {
        int arr[]={7,43,98,2,45};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
