//14.Using generic method perform Bubble sort

import java.util.Arrays;
import java.util.Scanner;

class bubble {
    // Generic method to perform bubble sort
    static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap if the current element is greater than the next
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];

        // Input elements of the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform bubble sort
        bubble.bubbleSort(array);

        // Output sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
