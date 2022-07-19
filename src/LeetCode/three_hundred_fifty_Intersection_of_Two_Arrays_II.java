package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class three_hundred_fifty_Intersection_of_Two_Arrays_II {

    public static void main(String[] args) {
        int[] nums1 = {15,7,8,9,4,5,633,2,1,5,6,4,5,7,8,9,5,4,2,3,5,4,6,4,5,2,2,1};
        int[] nums2 = {1,2,3,4,5,6,8,7,9,5,4,1,3,2,1,3,2,1,5,6,5,4,8,96,5,41,6,5,2,2,2};

        int size = 0;


        //expected = [2,2]

        Map<Integer, Integer> firstMap = new HashMap<>();
        Map<Integer, Integer> secondMap = new HashMap<>();

        for (int item : nums1) {
            firstMap.merge(item,1,Integer::sum);
        }
        for (int item : nums2) {
            secondMap.merge(item, 1, Integer::sum);
        }
        System.out.println(firstMap);
        System.out.println(secondMap);
        System.out.println("__________");
        //
        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : firstMap.entrySet()) {
            Integer value = secondMap.get(entry.getKey());
            if(value != null){
                result.put(entry.getKey(), Math.min(entry.getValue(), value));
                size += Math.min(entry.getValue(),value);
            }
        }
        int[] intersect = new int[size];
        int counter = 0;
        System.out.println(result);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            for (int i = 0; i < value; i++){
                intersect[counter] = key;
                counter++;
            }
        }

    }
}