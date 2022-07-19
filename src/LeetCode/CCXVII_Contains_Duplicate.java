package LeetCode;

import java.util.Arrays;

public class CCXVII_Contains_Duplicate {

    public static boolean duplicate (int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i< nums.length; i++){
        if (nums[i-1] == nums[i]){
            return true;}
        }
        return false;
    }

}
