/*
package LeetCode;


import java.util.HashMap;
import java.util.Map;

public class ThreeEightThree_Ransom_Note {

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomChar = ransomNote.toCharArray();
        char[] magazineChar = magazine.toCharArray();
        Map<Character, Integer> ransomNoteConteiner = new HashMap<>();
        Map<Character, Integer> magazineConteiner = new HashMap<>();
        for(char currentChar: ransomChar){
            ransomNoteConteiner.merge(currentChar, 1, Integer::sum);
        }
        for(char currentChar: magazineChar){
            magazineConteiner.merge(currentChar, 1, Integer::sum);
        }
        Map<Character, Integer> result = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : ransomNoteConteiner.entrySet()){
            result.computeIfAbsent();
        }
        System.out.println(ransomNoteConteiner);
        System.out.println(magazineConteiner);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("fo", "pfeorectr"));
    }

}
*/
