package LeetCode;

import java.util.Arrays;

public class TwoFourTwo_Valid_Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            char[] sString = s.toCharArray();
            char[] tString = t.toCharArray();
            Arrays.sort(sString);
            Arrays.sort(tString);
            for (int i = 0; i < sString.length; i++) {
               if (sString[i] != tString[i]){
                   return false;
               }
            }return true;
        }

        return false;
    }

    public static void main(String[] args) {
        isAnagram("anagram", "naagram");
    }

}
