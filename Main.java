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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        GetData getData = new GetData();
        Calculator calculator = new Calculator();
        while (true) {
            //step1:Display a menu and ask users to select an option.
            manager.Menu();
            //step2:Users select an option
            int option = getData.UserSelectOption();
            //step3:Perform function based on select option
            switch (option) {
                //Option1: Addition matrixes
                case 1:
                    manager.displayAddition();
                    //Get data of matrix 1
                    double[][] matrix1 = manager.getMatrix1(); 
                    //Get data of matrix 2
                    double[][] matrix2 = manager.getMatrix2(matrix1, option);
                    //Input 2 matrix(matrix 1 && matrix 2)
                    //Return value (result)
                    double result[][] = calculator.additionMatrix(matrix1, matrix2);
                    //Display result matrix 1 + matrix 2
                    manager.displayResult(matrix1, matrix2, result, option);
                    break;
                //Option2: Subtraction matrixes
                case 2:
                    manager.displaySubtraction();
                    //Get data of matrix 1
                    matrix1 = manager.getMatrix1();
                    //Get data of matrix 2
                    matrix2 = manager.getMatrix2(matrix1, option);
                    //Input 2 matrix(matrix 1 && matrix 2)
                    //Return value (result)
                    result = calculator.subtractionMatrix(matrix1, matrix2);
                    //Display result matrix 1 - matrix 2
                    manager.displayResult(matrix1, matrix2, result, option);
                    break;
                //Option3: Multiplication matries
                case 3:
                    manager.displayMultiplication();
                    //Get data of matrix 1
                    matrix1 = manager.getMatrix1();
                    //Get data of matrix 2
                    matrix2 = manager.getMatrix2(matrix1, option);
                    //Input 2 matrix(matrix 1 && matrix 2)
                    //Return value (result)
                    result = calculator.multiplicationMatrix(matrix1, matrix2);
                    //Display result matrix 1 * matrix 2
                    manager.displayResult(matrix1, matrix2, result, option);
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }

    }
}
