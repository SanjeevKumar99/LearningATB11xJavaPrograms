package ex_02_Java_String;

public class Lab009_RemoveSpaceFromString {
    public static void main(String[] args) {
        String str="Sanjeev is an Automation Engineer";
        str = str.replaceAll("\\s","");
        System.out.println(str);
    }
}
