package ex_01_Java_Basic;

public class Lab007_PrimeNumber {
    public static void main(String[] args) {
        int num=10;
        boolean isPrime=true;
        for (int i = 2; i <= num/2 ; i++) {
            if(num%2==0){
                isPrime=false;
                break;

            }
        }
        if(isPrime){
            System.out.println("This is a prime number");
        }
        else{
            System.out.println("Not Prime Number");
        }

    }
}
