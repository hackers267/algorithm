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

    public String No1_9(int N) {
        StringBuilder s = new StringBuilder();
        for (int n = N; n > 0; n /= 2) {
            s.insert(0, (n % 2));
        }
        return s.toString();
    }

    public int[] No1_12() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        return a;
    }

    public static int lg(int N) {
        int i = 0;
        while ((2 << i) <= N) {
            i++;
        }
        return i;
    }

    public static int[] histogram(int M, int[] a) {
        int[] array = new int[M];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int k : a) {
                if (i == k) {
                    sum++;
                }
            }
            array[i] = sum;
        }
        return array;
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }


    public static int mysteryAdd(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mysteryAdd(a * 2, b / 2);
        return mysteryAdd(a * 2, b / 2) + a;
    }

    public static int mysteryMulti(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mysteryMulti(a * a, b / 2);
        return mysteryMulti(a * a, b / 2) * a;
    }
}
