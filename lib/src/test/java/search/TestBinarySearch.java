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

    @Test
    public void ranks() {
        int key = 2;
        int[] a = {0, 0, 1, 1, 2, 2, 3, 3};
        int expected = 4;
        int actual = BinarySearch.ranks(key, a);
        assertEquals(expected, actual);

    }

    @Test
    public void ranksGreatThanLast() {
        int key = 2;
        int[] b = {0, 0, 1, 1};
        int expected = 4;
        int actual1 = BinarySearch.ranks(key, b);
        assertEquals(expected, actual1);
    }

    @Test
    public void ranksLessThanFirst() {
        int key = 2;
        int[] b = {2, 2, 3, 3, 4};
        int expected = 0;
        int actual1 = BinarySearch.ranks(key, b);
        assertEquals(expected, actual1);
    }
}
