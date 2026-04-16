import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int[][] a = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of elements in row " + i + ": ");
            int m = sc.nextInt();

            a[i] = new int[m];

            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The jagged array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
