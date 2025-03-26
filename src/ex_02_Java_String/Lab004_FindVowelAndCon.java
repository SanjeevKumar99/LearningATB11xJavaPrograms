package ex_02_Java_String;

public class Lab004_FindVowelAndCon {
    public static void main(String[] args) {
        int vowels=0;
        int con=0;
        String str="sanjeev is an automation engineer";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e' || ch== 'i' || ch=='o' || ch=='u'){
                vowels++;
            }else{
                con++;
            }
        }
        System.out.println("No. of vowel is: " + vowels);
        System.out.println("No. of con is: " + con);
    }
}
