import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];

        int zeroCount = 0, nonZeroCount = 0;

        System.out.println("Enter matrix:");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 0) zeroCount++;
                else nonZeroCount++;
            }
        }

        if(zeroCount > nonZeroCount)
            System.out.println("Matrix is Sparse");
        else
            System.out.println("Matrix is NOT Sparse");
    }
}

