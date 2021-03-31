package search;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (hi>=lo){
            int mid = lo + (hi - lo) / 2;
            int cur = a[mid];
            if (key==cur){
                return mid;
            }
            if (key<cur){
                hi = mid - 1;
            }
            lo = mid + 1;
        }
        return -1;
    }

}
