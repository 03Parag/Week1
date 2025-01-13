import java.util.Random;
// Create MatrixManipulation class to do operation , transpose and inverse matrix
public class MatrixManipulation {
    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(20) - 10; // Random values between -10 and 10
            }
        }
        return matrix;
    }
    // Method to add two matrices
    public static double[][] addMatrices(double[][] mat1, double[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }
    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] mat1, double[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }
    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] mat1, double[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;
        double[][] result = new double[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }
    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is not invertible.");
        }
        double[][] inverse = {
            { matrix[1][1] / determinant, -matrix[0][1] / determinant },
            { -matrix[1][0] / determinant, matrix[0][0] / determinant }
        };
        return inverse;
    }
    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is not invertible.");
        }
        double[][] cofactorMatrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double[][] subMatrix = new double[2][2];
                int subRow = 0, subCol;
                for (int row = 0; row < 3; row++) {
                    if (row == i) continue;
                    subCol = 0;
                    for (int col = 0; col < 3; col++) {
                        if (col == j) continue;
                        subMatrix[subRow][subCol++] = matrix[row][col];
                    }
                    subRow++;
                }
                cofactorMatrix[i][j] = Math.pow(-1, i + j) * determinant2x2(subMatrix);
            }
        }
        double[][] adjugateMatrix = transposeMatrix(cofactorMatrix);
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugateMatrix[i][j] / determinant;
            }
        }
        return inverse;
    }
    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f ", value);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create random matrices
        double[][] mat1 = createRandomMatrix(3, 3);
        double[][] mat2 = createRandomMatrix(3, 3);
        System.out.println("Matrix 1:");
        displayMatrix(mat1);
        System.out.println("\nMatrix 2:");
        displayMatrix(mat2);
        // Add matrices
        System.out.println("\nAddition:");
        displayMatrix(addMatrices(mat1, mat2));
        // Subtract matrices
        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(mat1, mat2));
        // Multiply matrices
        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrices(mat1, mat2));
        // Transpose matrix
        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(mat1));
        // Determinant and inverse
        System.out.println("\nDeterminant of Matrix 1: " + determinant3x3(mat1));
        try {
            System.out.println("\nInverse of Matrix 1:");
            displayMatrix(inverse3x3(mat1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
