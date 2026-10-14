import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];

        System.out.println("Enter matrix:");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary elements:");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(i==0 || j==0 || i==r-1 || j==c-1)
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }
}

