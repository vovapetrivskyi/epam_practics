package task_4;

/**
 * Created by Home on 07.11.2017.
 */
public class Matrix {
    int[][] matrix;

    public Matrix(int size) {
        matrix = new int[size][size];
        fillMatrix();
        turnMatrix();
    }

    void fillMatrix() {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                matrix[i][j] = (int) (Math.random() * 200 - 100);
    }

    void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    void turnMatrix() {
        System.out.println("Input matrix");
        showMatrix();
        for (int i = 0; i < matrix.length / 2; i++) // border -> center
        {
            for (int j = i; j < matrix.length - 1 - i; j++) // left -> right
            {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = tmp;
            }
        }
        System.out.println("Output matrix");
        showMatrix();
    }
}
