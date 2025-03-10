public class BubbleSort {
    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, then the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Main function to test the sorting
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);
        
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
