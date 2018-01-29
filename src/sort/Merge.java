package sort;

/**
 * @author: gnixgnohuh
 * @date : 18-1-26
 * @time : 上午10:56
 * @desc :
 */
public class Merge extends Sorter {

    private static Comparable[] aux;

    /**
     * 对数组a进行归并，从开始索引lo到结束索引hi
     *
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            //左空取右，右空取左，都存在取小
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void main(String[] args) {
        Integer[] a = {1, 4, 3, 8, 255, 11, 33, 5, 7};
        show(a);
        sort(a);
        show(a);
    }
}
