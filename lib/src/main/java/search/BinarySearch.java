package search;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            int cur = a[mid];
            if (key == cur) {
                return mid;
            }
            if (key < cur) {
                hi = mid - 1;
            }
            lo = mid + 1;
        }
        return -1;
    }

    public static int ranks(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        if (key > a[hi]) return hi + 1;
        if (key <= a[lo]) return 0;
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key && a[mid - 1] < key) {
                return mid;
            }
            if (a[mid] == key && a[mid - 1] == key) {
                hi = mid - 1;
            }
            if (a[mid] < key) {
                lo = mid + 1;
            }
            if (a[mid] > key) {
                hi = mid - 1;
            }
        }
        return 0;
    }

    public static int count(int key, int[] a) {
        int less = ranks(key, a);
        return ranks(key + 1, a) - less;
    }
}
