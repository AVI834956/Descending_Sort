
import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 9, 3};

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
