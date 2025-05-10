package ex_02_Java_String;

public class Lab10_OccurenceOfCharacter {
        public static void main(String[] args) {
            String input = "aabbbccde";
            char[] chars = input.toCharArray();
            boolean[] counted = new boolean[chars.length]; //- Use a boolean array (counted) to track whether a character has been processed.

            //HDBE2505055268115
            for (int i = 0; i < chars.length; i++) {
                if (!counted[i]) {
                    int count = 1;
                    for (int j = i + 1; j < chars.length; j++) {
                        if (chars[i] == chars[j]) {
                            count++;
                            counted[j] = true;
                        }
                    }
                    System.out.print(chars[i] + "" + count);
                }
            }
        }
    }

