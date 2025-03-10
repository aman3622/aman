public class BinarySearch {
    // Function to perform Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        // Loop until the left index exceeds the right index
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (arr[mid] == target) {
                return mid;  // Target found, return the index
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        // Sample sorted array
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int target = 8;
        
        // Perform the binary search
        int result = binarySearch(arr, target);

        // Display the result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
