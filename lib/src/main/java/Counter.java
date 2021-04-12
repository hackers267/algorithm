public class Counter {
    private final String name;
    private int count;

    Counter(String id) {
        name = id;
        count = 0;
    }

    public void increment() {
        count += 1;
    }

    public int tally() {
        return count;
    }

}
