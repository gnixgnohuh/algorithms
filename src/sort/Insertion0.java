package sort;

/**
 * @author: gnixgnohuh
 * @date : 18-1-26
 * @time : 上午9:50
 * @desc : 插入排序0
 */
public class Insertion0 extends Sorter {
    public static void sort(Comparable[] a) {
        //抽到一张新的扑克
        for (int i = 1; i < a.length; i++) {
            //之前扑克的索引
            for (int j = i; j > 0; j--) {
                //发现更大的扑克，交换顺序
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1, 4, 3, 8, 255, 11, 33, 5, 7};
        show(a);
        sort(a);
        show(a);
    }
}
