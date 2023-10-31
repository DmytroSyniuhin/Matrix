public class Matrix {
    public static final int SIZE = 8;
    public static void main(String[] args) {

        int[][] matrix = generateMatrix(8, 8);
    }
    public static int[][] generateMatrix(int row, int col) {
        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;

                } else {
                    matrix[i][j] = SIZE - j;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
}
