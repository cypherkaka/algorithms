package sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by cypherkaka on 4/9/16.
 */

public class BubbleSortTest {

    private Sort algorithm;
    private final int[] smallTest = new int[]{5, 8, 4, 1, 2, 9};
    private final int[] bigTest = new Random().ints(0, 70000).distinct().limit(70000).toArray();
    private static StringBuilder message;
    private int[] valueTobeTested;
    private LocalDateTime startTime;

    public static void tearDown() {
        message = null;
    }

    @Before
    public void beforeTest() {
        message = new StringBuilder("\n======= ======= ======= ======= \n");
        startTime = LocalDateTime.now();
        message.append("Before Sorting\t: " + startTime);
    }

    @After
    public void afterTest() {
        LocalDateTime endTime = LocalDateTime.now();
        long seconds = Duration.between(startTime, endTime).getSeconds();
        message.append("\nAfter Sorting\t: " + endTime + " :: Diff in SECONDS: " + seconds);
        message.append("\nSorted Values\t: " + Arrays.toString(valueTobeTested));
        System.out.println(message.toString());
    }

    @Test
    public void testBubbleSort() {
        valueTobeTested = smallTest;
        algorithm = new BubbleSort();
        appendClassName(false);
        algorithm.sort(smallTest);
    }

    @Test
    public void loadTestBubbleSort() {
        valueTobeTested = bigTest;
        algorithm = new BubbleSort();
        appendClassName(true);
        algorithm.sort(valueTobeTested);
    }


    private void appendClassName(final boolean isLoadTest) {
        message.append(" :: [" + algorithm.getClass().getSimpleName() + "] " + (isLoadTest ? "Load Test" : ""));
    }
}
