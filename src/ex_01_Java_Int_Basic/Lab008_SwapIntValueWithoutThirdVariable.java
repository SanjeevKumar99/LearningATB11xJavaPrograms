package ex_01_Java_Int_Basic;

public class Lab008_SwapIntValueWithoutThirdVariable {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;

        System.out.println("old value id num1 is: "+ num1);
        System.out.println("old value id num2 is: "+ num2);

        num2= num1+num2; //15
        num1= num2-num1; //10
        num2= num2-num1;

        System.out.println("After swapping the interger value");

        System.out.println("value of num1 is: " +num1);
        System.out.println("value of num2 is: " +num2);


    }
}
