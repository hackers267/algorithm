package practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Part1Test {
    @Test
    public void testNumber() {
        Part1 part1 = new Part1();
        List<Integer> list = part1.Numbers();
        assertEquals(list.size(), 15);
        for (int i = 0; i < list.size() - 2; i++) {
            Integer diff = list.get(i + 2) - list.get(i + 1);
            assertEquals(diff, list.get(i));
        }
    }

    @Test
    public void TestNo1_7_a() {
        Part1 part1 = new Part1();
        double t = part1.No1_7_a();
        assertTrue(t > 3.0);
        assertTrue(t < 3.1);
    }

    @Test
    public void TestNo1_7_b() {
        Part1 part1 = new Part1();
        int i = part1.No1_7_b();
        assertEquals(i, 499500);
    }

    @Test
    public void TestNo1_7_c() {
        Part1 part1 = new Part1();
        int i = part1.No1_7_c();
        assertEquals(i, 10000);
    }

    @Test
    public void TestNo1_9() {
        Part1 part1 = new Part1();
        int i = 7;
        String s = part1.No1_9(i);
        String result = Integer.toBinaryString(i);
        assertEquals(s, result);
    }

    @Test
    public void TestNo1_12() {
        Part1 part1 = new Part1();
        int[] a = part1.No1_12();
        int[] result = {0, 1, 2, 3, 4, 4, 3, 2, 1, 0};
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], a[i]);
        }
    }

    @Test
    public void TestNo1_14() {
        int N = 8;
        int result = Part1.lg(N);
        assertEquals(3, result);
        int N1 = 9;
        int result1 = Part1.lg(N1);
        assertEquals(3, result1);
    }

    @Test
    public void TestHistogram() {
        int M = 3;
        int[] a = {1, 1, 1, 2};
        int[] expected = {0, 3, 1};
        int[] actual = Part1.histogram(M, a);
        assertEquals(actual.length, expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
        int sum = Arrays.stream(actual).sum();
        assertEquals(sum, a.length);
    }

    @Test
    public void TestExR1() {
        int n = 6;
        String expected = "311361142246";
        String actual = Part1.exR1(n);
        assertEquals(expected, actual);
    }

    @Test
    public void TestMysteryAdd(){
        int result = Part1.mysteryAdd(2,25);
        int expected = 50;
        assertEquals(result,expected);
        int r = Part1.mysteryAdd(3,11);
        int e = 33;
        assertEquals(r,e);
    }

    @Test
    public void TestMysteryMulti(){
        int result = Part1.mysteryMulti(2,25);
        int expected = 33554432;
        assertEquals(result,expected);
        int r = Part1.mysteryMulti(3,11);
        int e = 177147;
        assertEquals(r,e);
    }
}
