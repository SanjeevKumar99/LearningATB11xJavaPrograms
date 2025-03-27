package ex_02_Java_String;

public class Lab006_ReverseEachWordOfString {
    public static void main(String[] args) {
        String str="Automation Engineer";
        String[] words = str.split(" ");
        String reverseString="";
        for(String word:words){
            String reverseword="";
            for (int i = word.length()-1; i >=0 ; i--) {
                reverseword=reverseword+ word.charAt(i);
            }
            reverseString=reverseString+reverseword+ " ";
        }
        System.out.println(reverseString);
    }
}
