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
}
