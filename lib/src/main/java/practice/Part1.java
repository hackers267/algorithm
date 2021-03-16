package practice;

import java.util.ArrayList;
import java.util.List;

public class Part1 {
    public List<Integer> Numbers() {
        List<Integer> list = new ArrayList<>();
        int f = 0;
        int g = 1;
        for (int i = 0; i < 15; i++) {
            list.add(f);
            f = f + g;
            g = f - g;
        }
        return list;
    }

    public double No1_7_a() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.01) {
            t = (9.0 / t + t) / 2.0;
        }
        return t;
    }

    public int No1_7_b() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public int No1_7_c() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        return sum;
    }
}
