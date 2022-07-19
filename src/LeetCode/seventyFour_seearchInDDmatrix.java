package LeetCode;

import java.util.Arrays;

public class seventyFour_seearchInDDmatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
            for (int[] i: matrix){
                for (int j: i){
                    if(j == target){
                        return true;
                    }
                }
            }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,15,11},{4,5,6},{8,5,2}};
        System.out.println(searchMatrix(matrix, 10));
    }




}
