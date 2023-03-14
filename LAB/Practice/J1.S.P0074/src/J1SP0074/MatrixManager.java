/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1SP0074;

import java.util.Scanner;

public class MatrixManager {
    
    //check size matrix 1 with addition and subtraction
    public static boolean checkSizeMaxtrix1(String stringMaxtrixSize, String type) {
        try {
            // check matrix size user input empty or not
            if (stringMaxtrixSize.isEmpty() == true) {
                System.out.println(type + " Maxtrix can not be empty. Please enter agian.");
                return false;
            } else {
                int matrixSize = Integer.parseInt(stringMaxtrixSize);
                // check matrix size user input <= 0 or not
                if (matrixSize <= 0) {
                    System.out.println(type + " Maxtrix must be > 0. Enter again.");
                    return false;
                } else {
                    return true;
                }

            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter digit only.");
            return false;
        }

    }

    private static int inputRowSizeMatrix1() {
        //Loop until user input valid
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Row Matrix 1:");
            String stringRowMaxtrixSize = scan.nextLine();
            // check row size matrix user input valid or not
            if (checkSizeMaxtrix1(stringRowMaxtrixSize, "Row") == true) {
                int rowMaxtrix = Integer.parseInt(stringRowMaxtrixSize);
                return rowMaxtrix;
            }

        }
    }

    private static int inputColumnSizeMatrix1() {
        //Loop until user input valid
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Column Matrix 1:");
            String stringColumnMaxtrixSize = scan.nextLine();
            // check column size matrix user input valid or not
            if (checkSizeMaxtrix1(stringColumnMaxtrixSize, "Column") == true) {
                int columnMaxtrix = Integer.parseInt(stringColumnMaxtrixSize);
                return columnMaxtrix;
            }
        }
    }

    //check size matrix 1 with addition and subtraction
    public static boolean checkSizeMaxtrix2(String stringMaxtrixSize, int sizeMatrix1, String type) {      
        try {
            // check matrix size user input empty or not
            if (stringMaxtrixSize.isEmpty() == true) {
                System.out.println(type + " Maxtrix can not be empty. Please enter agian.");
                return false;
            } else {
                int sizeMatrix2 = Integer.parseInt(stringMaxtrixSize);
                // check matrix size user input <= 0 or not
                if (sizeMatrix2 <= 0) {
                    System.out.println(type + " Maxtrix must be > 0. Enter again.");
                    return false;               
                }
                // check size of matrix2 is ​​equal to size of matrix 1 or not
                else if(sizeMatrix2!=sizeMatrix1){
                    System.out.println(type + " Maxtrix2 need to be equals with "+type+ " Matrix1. Please enter again.");
                    return false;
                }else{
                   return true; 
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter digit only.");
            return false;
        }
        
    }

    private static int inputRowMatrix2(int rowMatrix1) {
        //Loop until user input valid
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Row Matrix 2:");
            String stringRowMaxtrixSize = scan.nextLine();
            // check row size matrix user input valid or not
            if (checkSizeMaxtrix2(stringRowMaxtrixSize, rowMatrix1, "Row") == true) {
                int rowMaxtrix = Integer.parseInt(stringRowMaxtrixSize);
                return rowMaxtrix;
            }
        }
    }
    
    private static int inputColumnMatrix2(int columnMatrix1) {
        //Loop until user input valid
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Column Matrix 2:");
            String stringColumnMaxtrixSize = scan.nextLine();
            // check column size matrix user input valid or not
            if (checkSizeMaxtrix2(stringColumnMaxtrixSize, columnMatrix1, "Column") == true) {
                int columnMaxtrixSize = Integer.parseInt(stringColumnMaxtrixSize);
                return columnMaxtrixSize;
            }
        }
    }
   

    // enter the values ​​of the elements of matrix
    private static void generateMatrix(int[][] Matrix, int rowMatrix, int columnMatrix, String matrixName) {
        //traverse each row i of matrix 
        for (int i = 0; i < rowMatrix; i++) {
            // traverse each index j in row i matrix  
            for (int j = 0; j < columnMatrix; j++) {        
                
                Matrix[i][j] = inputMatrixValue(matrixName,i,j);
            }
        }
    }

    private static int inputMatrixValue(String matrixName, int i, int j) {
        //Loop until user input valid
        while (true) {
            try {
                System.out.print("Enter " + matrixName + "[" + (i + 1) + "][" + (j + 1) + "]:");
                Scanner scan = new Scanner(System.in);
                String stringMaxtrixValue = scan.nextLine();
                //check matrix value user input is empty or not
                if (stringMaxtrixValue.isEmpty()) {
                    System.out.println("Value of matrix can not be empty.Please enter again.");
                } else {
                    int maxtrixValue = Integer.parseInt(stringMaxtrixValue);
                    return maxtrixValue;
                }

            } catch (NumberFormatException e) {
                System.out.println("Value of matrix is digit.");

            }
        }
    }
    
    //adđ
    public static void additionMatrix() {
        System.out.println("-------- Addition --------");                                            
        int rowMatrix1 = inputRowSizeMatrix1();
        int columnMatrix1 = inputColumnSizeMatrix1();
        int[][] Matrix1 = new int[rowMatrix1][columnMatrix1];
        generateMatrix(Matrix1, rowMatrix1, columnMatrix1, "Matrix1");
        
        int rowMatrix2 = inputRowMatrix2(rowMatrix1);
        int columnMatrix2 = inputColumnMatrix2(columnMatrix1);
        int[][] Matrix2 = new int[rowMatrix2][columnMatrix2];
        generateMatrix(Matrix2, rowMatrix2, columnMatrix2, "Matrix2");
        
        int[][] sumMatrix = addMatrix(Matrix1, Matrix2);
        displayResult(Matrix1, "+", Matrix2, sumMatrix);

    }

    private static int[][] addMatrix(int[][] Matrix1, int[][] Matrix2) {
        int[][] sumMatrix = new int[Matrix1.length][Matrix1[0].length];
        //traverse each row i of matrix 
        for (int i = 0; i < sumMatrix.length; i++) {
            // traverse each index j in row i matrix 
            for (int j = 0; j < sumMatrix[0].length; j++) {
                sumMatrix[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }
        return sumMatrix;
    }
   
    //sub
    public static void subtractionMatrix() {
        System.out.println("------ Subtraction ------");   
        
        int rowMatrix1 = inputRowSizeMatrix1();
        int columnMatrix1 = inputColumnSizeMatrix1();
        int[][] Matrix1 = new int[rowMatrix1][columnMatrix1];
        generateMatrix(Matrix1, rowMatrix1, columnMatrix1, "Matrix1");
        
        int rowMatrix2 = inputRowMatrix2(rowMatrix1);
        int columnMatrix2 = inputColumnMatrix2(columnMatrix1);
        int[][] Matrix2 = new int[rowMatrix2][columnMatrix2];
        generateMatrix(Matrix2, rowMatrix2, columnMatrix2, "Matrix2");
        
        int[][] differenceMatrix = subtractionMatrix(Matrix1, Matrix2);
        displayResult(Matrix1, "-", Matrix2, differenceMatrix);
    }

    private static int[][] subtractionMatrix(int[][] Matrix1, int[][] Matrix2) {
        int[][] differenceMatrix = new int[Matrix1.length][Matrix1[0].length];
        //traverse each row i of matrix 
        for (int i = 0; i < differenceMatrix.length; i++) {
            // traverse each index j in row i matrix  
            for (int j = 0; j < differenceMatrix[0].length; j++) {
                differenceMatrix[i][j] = Matrix1[i][j] - Matrix2[i][j];
            }
        }
        return differenceMatrix;
    }

    private static void displayResult(int[][] Matrix1, String operator, int[][] Matrix2, int[][] resultMatrix) {
        System.out.println("-------- Result --------");                                            
        displayMaxtrix(Matrix1);
        System.out.println(operator);
        displayMaxtrix(Matrix2);
        System.out.println("=");
        displayMaxtrix(resultMatrix);

    }

    private static void displayMaxtrix(int[][] Matrix) {

        //traverse each row i of matrix 
        for (int i = 0; i < Matrix.length; i++) {
            // traverse each index j in row i matrix  
            for (int j = 0; j < Matrix[0].length; j++) {
                System.out.print("[" + Matrix[i][j] + "]");
            }
            System.out.println();
        }

    }

    //multi

    //check row
    public static boolean checkRowMaxtrix2ToMultipli(String stringRowMaxtrix, int columnMatrix1) {
        try {
            // check matrix size user input empty or not
            if (stringRowMaxtrix.isEmpty() == true) {
                System.out.println("Row Maxtrix can not be empty. Please enter agian.");
                return false;
            } else {
                int rowMatrix2 = Integer.parseInt(stringRowMaxtrix);
                // check row of matrix user input <= 0 or not
                if (rowMatrix2 <= 0) {
                    System.out.println("Row Maxtrix must be > 0. Enter again.");
                    return false;
                }
                //check row of matrix user input is equals to column matrix1 or not                  
                else if(rowMatrix2!=columnMatrix1){
                    System.out.println("Row Maxtrix2 need to be equals with column Matrix1. Please enter again.");
                    return false;
                }else{
                    return true;
                }

            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter digit only.");
            return false;
        }
        
    }

    private static int inputRowMatrix2ToMultipli(int columnMatrix1) {
        //Loop until user input valid
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Row Matrix 2:");
            String stringRowMaxtrixSize = scan.nextLine();
            // check row size matrix user input valid or not
            if (checkRowMaxtrix2ToMultipli(stringRowMaxtrixSize, columnMatrix1) == true) {
                int rowMaxtrix = Integer.parseInt(stringRowMaxtrixSize);
                return rowMaxtrix;
            }

        }
    }
    
    //check column
    public static boolean checkColumnMaxtrix2ToMultipli(String stringColumnMatrixSize) {
        try {
            // check column matrix size user input empty or not
            if (stringColumnMatrixSize.isEmpty() == true) {
                System.out.println("Column Maxtrix can not be empty. Please enter agian.");
                return false;
            } else {
                int columnMatrixSize = Integer.parseInt(stringColumnMatrixSize);
                // check column matrix size user input <= 0 or not
                if (columnMatrixSize <= 0) {
                    System.out.println("Column Maxtrix must be > 0. Enter again.");
                    return false;
                }else{
                    return true;
                }

            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter digit only.");
            return false;
        }
        
      
    }

    private static int inputColumnMatrix2ToMultipli() {
        //Loop until user input valid
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Column Matrix 2:");
            String stringColumnMatrixSize = scan.nextLine();
            // check column size matrix user input valid or not
            if (checkColumnMaxtrix2ToMultipli(stringColumnMatrixSize) == true) {
                int rowMaxtrix = Integer.parseInt(stringColumnMatrixSize);
                return rowMaxtrix;
            }

        }
    }
    
    public static void multiplicationMatrix() {
        System.out.println("------ Multiplication ------");  
        
        int rowMatrix1 = inputRowSizeMatrix1();
        int columnMatrix1 = inputColumnSizeMatrix1();
        int[][] Matrix1 = new int[rowMatrix1][columnMatrix1];
        generateMatrix(Matrix1, rowMatrix1, columnMatrix1, "Matrix1");
        
        int rowMatrix2 = inputRowMatrix2ToMultipli(columnMatrix1);
        int columnMatrix2 = inputColumnMatrix2ToMultipli();
        int[][] Matrix2 = new int[rowMatrix2][columnMatrix2];
        generateMatrix(Matrix2, rowMatrix2, columnMatrix2, "Matrix2");
        
        int[][] productMatrix = multiplyMatrix(Matrix1, Matrix2);
        displayResult(Matrix1, "*", Matrix2, productMatrix);
    }
    
    private static int[][] multiplyMatrix(int[][] Matrix1, int[][] Matrix2) {
        //productMatrix has row is row of matrix1 and column is column of matrix2
        int[][] productMatrix = new int[Matrix1.length][Matrix2[0].length];
        // traverse each row i in matrix 1
        for (int i = 0; i < Matrix1.length; i++) {
            // traverse each column j in matrix 2
            for (int j = 0; j < Matrix2[0].length; j++) {
                // traverse each index k in row i of matrix 1 and each index k in column j of matrix 2
                for (int k = 0; k < Matrix1[0].length; k++) {
                    productMatrix[i][j] = productMatrix[i][j] + Matrix1[i][k] * Matrix2[k][j];
                }
            }
        }
        return productMatrix;
    }

}
