package sorting;


/**
 * Created by cypherkaka on 4/9/16.
 * <p>
 * Reference: https://en.wikipedia.org/wiki/Bubble_sort
 * <p>
 * Data structure	        : Array
 * Worst case performance	: O(n^2)
 * Best case performance	: O(n)
 * Average case performance	: O(n^2)
 * Worst case space complexity: O(1)
 */
public class BubbleSort implements Sort {

    public void sort(int[] unsortedArray) {

        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = i + 1; j < unsortedArray.length; j++) {

                if (unsortedArray[i] > unsortedArray[j]) {
                    unsortedArray[i] = unsortedArray[i] + unsortedArray[j];
                    unsortedArray[j] = unsortedArray[i] - unsortedArray[j];
                    unsortedArray[i] = unsortedArray[i] - unsortedArray[j];
                }
            }
        }
    }
}


