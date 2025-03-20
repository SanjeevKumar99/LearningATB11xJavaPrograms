package ex_02_Java_String;

public class Lab009_ReverseString {
    public static void main(String[] args) {
        String str = "Sanjeev";
        String rev = "";
        for (int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
    }
}
