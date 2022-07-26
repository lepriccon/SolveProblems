package Sorting;

public class BubbleSorting {

    public static void main(String[] args) {
        BubbleSorting test = new BubbleSorting();
        int[] nums = {1,5,3,7,8,9,4,62,5,4,1,6,2,3};
        test.sortingBubble(nums);
        for (int i :
                nums) {
            System.out.println(i);
        }

    }

    public int[] sortingBubble (int[] array){
        for (int i =1; i<array.length; i++){
            if (array[i-1]> array[i]){
                swap(array, i, i-1);
            }
        }
        return array;
    }

    public void swap(int[] array, int index, int index1){
        int current = array[index];
        array[index] = array[index1];
        array[index1] = current;
    }
}
