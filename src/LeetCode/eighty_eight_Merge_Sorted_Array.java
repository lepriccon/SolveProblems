package LeetCode;

import java.util.Arrays;

public class eighty_eight_Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i: nums2){
            nums1[m] = i;
            m++;
        }
        Arrays.sort(nums1);
        for (int i: nums1){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

}
