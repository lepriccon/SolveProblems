package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class threeHundredEightySevenFirstUniqueCharacterInA_String {

    public static int firstUniqChar(String s) {
        Map<Character, SomeChar> mapOfCharS = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (mapOfCharS.containsKey(currentChar)) {
                //ToDo if key exists
                mapOfCharS.get(currentChar).counter++;

            } else {
                SomeChar newValue = new SomeChar();
                newValue.index = i;
                newValue.counter = 1;
                mapOfCharS.put(currentChar, newValue);
            }

        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, SomeChar> entry : mapOfCharS.entrySet()) {
            if (entry.getValue().counter == 1){
                if(entry.getValue().index < min){
                    min = entry.getValue().index;
                }
            }
        }
        /*System.out.println(mapOfCharS);*/
        if (min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }

    static class SomeChar {
        int counter;
        int index;

        @Override
        public String toString() {
            return "SomeChar{" +
                    "counter=" + counter +
                    ", index=" + index +
                    '}';
        }
    }

    public static void main(String[] args) {
        firstUniqChar("loveleetcode");
    }
}
