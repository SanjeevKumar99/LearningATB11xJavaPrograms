package ex_02_Java_String;

import java.util.HashMap;

public class Lab11_CharOccurenceUsingMap {
    public static void main(String[] args) {
        String str="Sanjeev Kumar";
        char[] ch= str.toCharArray();
        HashMap<Character, Integer> map= new HashMap<>();
        for (char keys: ch){
            if(map.containsKey(keys)){
                map.put(keys, map.get(keys)+1);
            }
            else{
                map.put(keys, 1);
            }

        }
        System.out.println(map);
    }
}
