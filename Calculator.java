/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_program;

/**
 *
 * @author ADMIN
 */
class Calculator {

    public double[][] additionMatrix(double[][] matrix1, double[][] matrix2) {
        int row = matrix1.length;
        int column = matrix1[0].length;
        double[][] result = new double[row][column];
        //loop traversing from begin to end in row
        for (int i = 0; i < row; i++) {
            //loop traversing from begin to end in column 
            for (int j = 0; j < column; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public double[][] subtractionMatrix(double[][] matrix1, double[][] matrix2) {
        int row = matrix1.length;
        int column = matrix1[0].length;
        double[][] result = new double[row][column];
        //loop traversing from begin to end in row
        for (int i = 0; i < row; i++) {
            //loop traversing from begin to end in column 
            for (int j = 0; j < column; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public double[][] multiplicationMatrix(double[][] matrix1, double[][] matrix2) {
        int rowMatrix1 = matrix1.length;
        int columnMatrix1 = matrix1[0].length;
        int columnMatrix2 = matrix2[0].length;
        double[][] result = new double[rowMatrix1][columnMatrix2];
        //loop traversing from begin to end in row of matrix 1
        for (int i = 0; i < rowMatrix1; i++) {
            //loop traversing from begin to end in column of matrix 1
            for (int j = 0; j < columnMatrix1; j++) {
                //loop traversing from begin to end in column of matrix 2
                for (int k = 0; k < columnMatrix2; k++) {
                    result[i][k] += matrix1[i][j] * matrix2[j][k];
                }
            }
        }
        return result;
    }
}
