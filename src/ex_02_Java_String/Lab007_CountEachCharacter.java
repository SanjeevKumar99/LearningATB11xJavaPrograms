package ex_02_Java_String;

public class Lab007_CountEachCharacter {
    public static void main(String[] args) {
        String str="Sanjeev is an engineer";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
             str.charAt(i);
             count++;
        }
        System.out.println(count);
    }
}
