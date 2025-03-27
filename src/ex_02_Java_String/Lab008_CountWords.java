package ex_02_Java_String;

public class Lab008_CountWords {
    public static void main(String[] args) {
        String str="Sanjeev is an Automation Engineer";
        String[] words = str.split(" ");
        int count=0;

        for(String word: words){
            count++;
        }
        System.out.println(count);
    }
}
