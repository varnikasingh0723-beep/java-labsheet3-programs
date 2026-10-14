import java.util.Arrays;

public class Question29 {
    public static void main(String[] args) {
        int arr[][] = {
            {5, 2, 9},
            {1, 7},
            {4, 6, 3, 8}
        };

        for(int i=0; i<arr.length; i++) {
            Arrays.sort(arr[i]); // sort each row
        }

        System.out.println("Sorted jagged array:");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

