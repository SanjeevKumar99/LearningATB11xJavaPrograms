package ex_01_Java_Int_Basic;

public class Lab003_FibonacciSeries {
    public static void main(String[] args) {
        int itr = 10;
        int num1=0;
        int num2=1;
        int num3;

        for(int i=0; i<itr; i++){
            System.out.print(num1 +",");
            num3 = num2 + num1; /*1-> 1+1*/
            num1=num2; // 1
            num2= num3; // 1



        }
    }
}
