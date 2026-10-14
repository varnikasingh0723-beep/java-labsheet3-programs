import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }

        System.out.println("Copied array:");
        for(int i=0; i<n; i++) {
            System.out.println(arr2[i]);
        }
    }
}

