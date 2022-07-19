package LeetCode;

public class LIII_Maximum_Subarray {

    public static int Subarray(int[] nums) {
        int subarray_max = nums[0];
        int subarray_current = nums[0];

        for (int i=1; i < nums.length; i++){
            if (subarray_current + nums[i] < nums[i]){
                subarray_current = nums[i];
            } else {
                subarray_current += nums[i];
            }
            if (subarray_current > subarray_max){
                subarray_max = subarray_current;
            }
        }
        return subarray_max;
    }
}
