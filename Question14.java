import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][2][2];

        System.out.println("Enter elements for 2x2x2 array:");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                for(int k=0; k<2; k++) {
                    System.out.print("Element at ["+i+"]["+j+"]["+k+"]: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("\nDisplaying 2x2x2 array elements:");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                for(int k=0; k<2; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + arr[i][j][k]);
                }
            }
        }
    }
}

