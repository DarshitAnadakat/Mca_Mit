public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int result = 1;
        
        // Multiply all elements in the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result *= matrix[i][j];
            }
        }
        
        System.out.println("The product of all elements in the matrix is: " + result);
    }
}
