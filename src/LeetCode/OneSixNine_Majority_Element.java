package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OneSixNine_Majority_Element {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 5, 5, 4, 2};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
       Set<Integer> sortHashSet = new HashSet<>();
       int maxCounter = 0;
       int counter = 0;
       Arrays.sort(nums);
        int maxValue = nums[0];
       for (int i: nums){
           if (sortHashSet.add(i)){
               counter = 1;
           }else {
               counter++;
               if(counter > maxCounter){
                   maxCounter=counter;
                   maxValue=i;
               }
           }
       }
       return maxValue;
    }
}
