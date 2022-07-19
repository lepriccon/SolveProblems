package LeetCode;

import java.util.Arrays;

public class FiveHundredSixtySix_Reshape_the_Matrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length == r*c){
        int[][] numbers = new int[r][c];
        int row = 0;
        int column = 0;
        for (int[] i: mat){
            for (int j: i){
                numbers[row][column] = j;
                if (column<c){
                    column++;
                } if (column==c){
                    row++;
                    column = 0;
                }
            }
        }
        return numbers;
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(matrixReshape(matrix, 6, 1)));
        /*System.out.printf("ROWs->" + matrix.length + " || " + matrix[0].length + "<-Columns");*/
    }

}
