package sort;

/**
 * @author: gnixgnohuh
 * @date : 18-1-26
 * @time : 上午10:12
 * @desc : 对选择排序添加一个分组操作
 */
public class Shell extends Sorter {
    private static final int THREE = 3;
    public static void sort(Comparable[] a) {
        int l = a.length;
        int h = 1;
        while (h < l / THREE) {
            h = THREE * h + 1;
        }

        while (h >= 1) {
            //抽到一张新的扑克
            for (int i = h; i < l; i++) {
                //之前扑克的索引
                for (int j = i; j >= h; j -= h) {
                    //发现更大的扑克，交换顺序
                    if (less(a[j], a[j - h])) {
                        exch(a, j, j - h);
                    }
                }
            }
            h /= THREE;
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1, 4, 3, 8, 255, 11, 33, 5, 7};
        show(a);
        sort(a);
        show(a);
    }
}
