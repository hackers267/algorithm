package practice;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
}
