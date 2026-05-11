import java.util.Scanner;

public class ArrayOperations {

    // Method to display array
    static void display(int arr[], int n) {
        System.out.println("Array Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to find maximum element
    static int maximum(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Method to find minimum element
    static int minimum(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    // Method to calculate sum
    static int sum(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to calculate average
    static double average(int arr[], int n) {
        return (double) sum(arr, n) / n;
    }

    // Method to search element
    static void search(int arr[], int n, int key) {
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element not found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Method Calls
        display(arr, n);

        System.out.println("Maximum Element: " + maximum(arr, n));
        System.out.println("Minimum Element: " + minimum(arr, n));
        System.out.println("Sum of Elements: " + sum(arr, n));
        System.out.println("Average of Elements: " + average(arr, n));

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        search(arr, n, key);

        sc.close();
    }
}