package sort;

/**
 * @author: gnixgnohuh
 * @date : 18-1-4
 * @time : 下午4:05
 * @desc : 插入排序
 */
public class Insertion extends Sorter {
    public static void sort(Comparable[] a) {
        int len = a.length;
        //i左边的元素全部有序
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                //插入扑克
                if (less(a[i], a[j])) {
                    exch(a, i, j);
                }
            }
        }
    }

    protected static void exch(Comparable[] a, int endIndex, int beginIndex) {
        Comparable tmp = a[endIndex];
        for (int i = endIndex; i > beginIndex; i--) {
            a[i] = a[i - 1];
        }
        a[beginIndex] = tmp;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 4, 3, 8, 255, 11, 33, 5, 7};
        exch(a, 6, 0);
        show(a);
        sort(a);
        show(a);
    }
}
