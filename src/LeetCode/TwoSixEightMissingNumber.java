package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSixEightMissingNumber {

    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        Set<Integer> sortSet = new HashSet<>();
        for (int i : nums) {
            sortSet.add(i);
        }
        for (int i = 1; i < nums.length+1; i++){
            if(sortSet.add(i)){
                return i;
            };
        }
        return 0;
    }
}
