import java.util.Scanner;

public class Merge_short {

    // Method to merge two sorted subarrays into one sorted array
    void merge(int[] arr, int st, int mid, int end) {
        int n1 = mid - st + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[st + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into arr
        int i = 0, j = 0;
        int k = st; // Start index for merged subarray

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Method to implement merge sort
    void sort(int[] arr, int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;

            // Recursively sort first and second halves
            sort(arr, st, mid);
            sort(arr, mid + 1, end);

            // Merge the sorted halves
            merge(arr, st, mid, end);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the original array
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Create an instance of MergeSort and sort the array
        Merge_short mergeSort = new Merge_short();
        mergeSort.sort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
