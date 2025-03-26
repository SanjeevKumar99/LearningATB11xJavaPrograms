package ex_02_Java_String;

public class Lab005_DoubleTheCharOfString {
    public static void main(String[] args) {
        String str="Sanjeev";
        str=str.toLowerCase();
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            newStr =newStr + str.charAt(i)+ str.charAt(i);

        }
        System.out.println(newStr);
    }
}
