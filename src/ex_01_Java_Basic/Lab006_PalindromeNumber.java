package ex_01_Java_Basic;

public class Lab006_PalindromeNumber {
    public static void main(String[] args) {
        int num=198891;
        int originalNo= num;
        int rev=0;
         while( num !=0){
             rev=rev*10 + num%10;
             num /= 10;
         }
         if (originalNo == rev){
             System.out.println(rev +" ->Yes, this is a Palindrome Number");
         } else{
             System.out.println(rev +" -> Nope!, Sorry this is not a Palindrome Number");
         }

    }
}
