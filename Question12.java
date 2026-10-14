import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int sum[][] = new int[3][3];

        System.out.println("Enter first 3x3 matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second 3x3 matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of matrices:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
