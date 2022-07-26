package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort sorting = new SelectionSort();
        int[] nums = {1,3, 6,7,8,9,4,62,5,5,6, 7,2};
        sorting.selectionSort(nums);
        for (int i :
                nums) {
            System.out.println(i);
        }

    }

    public void selectionSort(int[] nums){
        for (int i = 0; i< nums.length; i++){
            int minInt = i;
            for (int step = i+1; step< nums.length; step++){
                if (nums[minInt] < nums[step]){
                    minInt=step;
                }
            }
            swap(nums, minInt, i);
        }

    }

    public void swap(int[] array, int index, int index1){
        int current = array[index];
        array[index] = array[index1];
        array[index1] = current;
    }

}
