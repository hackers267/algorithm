package search;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {
    @Test
    public void TestRankNotEmpty() {
        int key = 3;
        int[] a = {0, 1, 2, 3, 4, 5, 6};
        int expected = 3;
        int actual = BinarySearch.rank(key, a);
        assertEquals(actual, expected);
    }

    @Test
    public void TestRankEmpty() {
        int key = 7;
        int[] a = {0, 1, 2, 3, 4, 5, 6};
        int expected = -1;
        int actual = BinarySearch.rank(key, a);
        assertEquals(actual, expected);
    }
}
