/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_program;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Manager {

    Calculator calculator = new Calculator();

    GetData getData = new GetData();

    public void Menu() {
        System.out.println("======Calculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrixes");
        System.out.println("4. Quit");
    }

    public void displayAddition() {
        System.out.println("----- Addition ------");
    }

    public void displaySubtraction() {
        System.out.println("----- Subtraction ------");
    }

    public void displayMultiplication() {
        System.out.println("-------- Multiplication -------");
    }

    public double[][] getMatrix1() {
        Scanner sc = new Scanner(System.in);
        int rowMatrix1 = 0;
        int columnMatrix1 = 0;
        //check row number matrix 1
        while (true) {
            System.out.print("Enter Row Matrix 1:");
            //row number must be number
            try {
                rowMatrix1 = Integer.parseInt(sc.nextLine());
                //row must greater than 0
                if (rowMatrix1 <= 0) {
                    System.out.println("Row must be integer greater than 0!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input integer number!");
            }
        }
        //check column number matrix 1
        while (true) {
            System.out.print("Enter Column Matrix 1:");
            //column number must be number
            try {
                columnMatrix1 = Integer.parseInt(sc.nextLine());
                //column must greater than 0 
                if (columnMatrix1 <= 0) {
                    System.out.println("Column must be integer greater than 0!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input integer number!");
            }

        }
        //input value matrix 1
        double matrix1[][] = new double[rowMatrix1][columnMatrix1];
        //loop use to get index from first to last of row
        for (int i = 0; i < rowMatrix1; i++) {
            //loop use to get index from first to last of column
            for (int j = 0; j < columnMatrix1; j++) {
                //check value of row and column
                while (true) {
                    System.out.print("Enter Matrix1[" + (i + 1) + "][" + (j + 1) + "]:");
                    //value must be number
                    try {
                        matrix1[i][j] = Double.parseDouble(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Value of matrix is digit");
                    }
                }
            }
        }
        return matrix1;
    }

    public double[][] getMatrix2(double[][] matrix1, int option) {
        Scanner sc = new Scanner(System.in);
        int rowMatrix1 = matrix1.length;
        int columnMatrix1 = matrix1[0].length;
        int rowMatrix2 = 0;
        int columnMatrix2 = 0;
        //if user choice option 3 
        if (option == 3) {
            //row number of matrix 2 must be number
            while (true) {
                System.out.print("Enter Row Matrix 2:");
                try {
                    rowMatrix2 = Integer.parseInt(sc.nextLine());
                    //check row of matrix 2 same or not same as  column of matrix 1
                    if (rowMatrix2 == columnMatrix1) {
                        break;
                    } else {
                        System.out.println("Row matrix 2 must be equal column matrix 1");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input integer number!");
                }
            }
            //column number of matrix 2 must be number
            while (true) {
                System.out.print("Enter Column Matrix 2:");
                try {
                    columnMatrix2 = Integer.parseInt(sc.nextLine());
                    //check column matrix 2 must same column matrix 1
                    if (columnMatrix2 <= 0) {
                        System.out.println("Column matrix 2 must be greater than 0! ");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input integer number!");
                }
            }
        //user select other option    
        } else {
            //check row number matrix 2
            while (true) {
                System.out.print("Enter Row Matrix 2:");
                //row number of matrix 2 must be number
                try {
                    rowMatrix2 = Integer.parseInt(sc.nextLine());
                    //row of matrix 2 must same row of matrix 1
                    if (rowMatrix2 != rowMatrix1) {
                        System.out.println("Row of matrix 2 must same Row of matrix 1");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input integer number!");
                }
            }
            //check column number matrix 2
            while (true) {
                System.out.print("Enter Column Matrix 2:");
                //column number of matrix 2 must be number
                try {
                    columnMatrix2 = Integer.parseInt(sc.nextLine());
                    //column of matrix 2 must same Column of matrix 1
                    if (columnMatrix2 != columnMatrix1) {
                        System.out.println("Column of matrix 2 must same Column of matrix 1");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input integer number!");
                }

            }
        }
        //input value matrix 2
        double matrix2[][] = new double[rowMatrix2][columnMatrix2];
        //loop use to get index from first to last of row
        for (int i = 0; i < rowMatrix2; i++) {
            //loop use to get index from first to last of column
            for (int j = 0; j < columnMatrix2; j++) {
                //check value of row and column
                while (true) {
                    System.out.print("Enter Matrix2[" + (i + 1) + "][" + (j + 1) + "]:");
                    //value must be number
                    try {
                        matrix2[i][j] = Double.parseDouble(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Value of matrix is digit");
                    }
                }
            }
        }
        return matrix2;
    }

    public void displayMatrix(double matrix1[][]) {
        int row = matrix1.length;
        int column = matrix1[0].length;
        //loop use to get index from first to last of row
        for (int i = 0; i < row; i++) {
            //loop use to get index from first to last of column
            for (int j = 0; j < column; j++) {
                System.out.printf("%s%.0f%s", "[", matrix1[i][j], "]");
            }
            System.out.println("");
        }
    }

    public void displayResult(double[][] matrix1, double[][] matrix2, double[][] result, int option) {
        System.out.println("------- Result ----------");
        displayMatrix(matrix1);
        switch (option) {
            case 1:
                System.out.println("+");
                break;
            case 2:
                System.out.println("-");
                break;
            case 3:
                System.out.println("*");
                break;
        }
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }

}
