
 class Matrix {
    private int rows;
    private int cols;
    private int[][] data;
    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }
    private Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions to be added.");
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }
    public Matrix subtract(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions to be subtracted.");
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return result;
    }
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Name : Swapnil Verma");
        System.out.println("Roll NO : 2400320101154");
        int[][] array1 = {
            {5, 8, 3},
            {2, 1, 9}
        };
        
        int[][] array2 = {
            {1, 4, 2},
            {1, 0, 5}
        };

        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);

        System.out.println("\nMatrix 1");
        matrix1.print();

        System.out.println("\nMatrix 2");
        matrix2.print();

        try {
            System.out.println("\nAddition Result (M1 + M2)");
            Matrix sum = matrix1.add(matrix2);
            sum.print();

            System.out.println("\nSubtraction Result (M1 - M2)");
            Matrix difference = matrix1.subtract(matrix2);
            difference.print();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
