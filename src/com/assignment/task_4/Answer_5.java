package com.assignment.task_4;

public class Answer_5 {
    public static void main(String[] args) {
        int[][] matrix_1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix_2 = {{10,11,12},{13,14,15},{16,17,18}};

        int row = matrix_1.length;
        int col = matrix_1[0].length;
        int[][] add_matrices = new int[row][col];

        System.out.println("Matrix Addition:");
        for(int i = 0; i< row; i++){
            for(int j = 0; j< col; j++){
                add_matrices[i][j] = matrix_1[i][j] + matrix_2[i][j];
                System.out.print(add_matrices[i][j] + " ");
            }
            System.out.println();
        }

    }
}
