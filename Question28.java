import java.util.Scanner;

public class Question28 {
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

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(matrix[i][j] == search) {
                    System.out.println("Found at row " + (i+1) + ", column " + (j+1));
                    found = true;
                }
            }
        }

        if(!found) System.out.println("Element not found");
    }
}

