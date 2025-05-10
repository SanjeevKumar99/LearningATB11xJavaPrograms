package Misc_Concept;

public class Lab004_ReverseInitialWordOfString {
    public static void main(String[] args) {
        String str= "Sanjeev Kumar";
        String newStr= str.replace("Kumar", "");
        char[] ch= newStr.toCharArray();
        String rev="";
        for(int i=ch.length-1; i>=0;i--){
            rev=rev+ch[i];
        }
        System.out.println(rev);
    }
}
