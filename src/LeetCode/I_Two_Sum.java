package LeetCode;

public class I_Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        int[] index = {0, 0};
        for (int i = 0; i < nums.length; i++){
                int first = nums[i];
                int expected = target - first;
                index[0] = i;
                for (int indexSearch = i+1; indexSearch<nums.length; indexSearch++){
                   if (expected == nums[indexSearch]){
                       index[1] = indexSearch;
                       return index;
                   }
                }
            }
        return index;
    }

}
