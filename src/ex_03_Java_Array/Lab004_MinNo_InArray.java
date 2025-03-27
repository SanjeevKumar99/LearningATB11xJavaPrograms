package ex_03_Java_Array;

public class Lab004_MinNo_InArray {
    public static void main(String[] args) {
        //int arr[]= {12,76,98,23,56,74};
        int[] arr = new int[6];
        arr[0]=12;
        arr[1]=76;
        arr[2]=98;
        arr[3]=5;
        arr[4]=56;
        arr[5]=74;
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Minimum value in array is: "+min);
    }
}
