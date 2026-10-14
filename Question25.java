import java.util.Scanner;

public class Question25 {
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

        int mainSum = 0, secSum = 0;
        for(int i=0; i<n; i++) {
            mainSum += matrix[i][i];        
            secSum += matrix[i][n-1-i];       
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secSum);
    }
}
