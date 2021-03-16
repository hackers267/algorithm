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
}
