package sort;

/**
 * @author: gnixgnohuh
 * @date : 18-1-4
 * @time : 下午3:33
 * @desc : 选择排序
 */
public class Selection extends Sorter {
    public static void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i; j < len; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1,4,3,8,255,11,33,5};
        show(a);
        sort(a);
        show(a);
    }
}
