package ex_02_Java_String;

public class Lab003_StringPalindrome {
    public static void main(String[] args) {
        String str= "Level";
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev=rev + str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is Not Palindrome");
        }
    }
}
