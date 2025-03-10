public class LinearSearch {
    // Function to perform Linear Search
    public static int linearSearch(int[] arr, int target) {
        // Loop through the array to find the target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Target found, return index
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        // Sample array and target to search
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int target = 8;

        // Perform the search and store the result
        int result = linearSearch(arr, target);

        // Display the result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
