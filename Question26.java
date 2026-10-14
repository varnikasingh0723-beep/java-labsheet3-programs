import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];

        System.out.println("Enter " + n + "x" + n + " matrix:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Upper Triangular:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i <= j) System.out.print(matrix[i][j] + " ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("Lower Triangular:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i >= j) System.out.print(matrix[i][j] + " ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}

