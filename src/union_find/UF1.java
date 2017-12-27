package union_find;

/**
 * @author: gnixgnohuh
 * @date : 17-12-27
 * @time : 下午3:49
 * @desc :
 */
public class UF1 {
    private int[] id;
    private int count;

    public UF1(int count) {
        this.count = count;
        id = new int[count];
        for (int i = 0; i < count; i++) {
            id[i] = i;
        }
    }

    /**
     * 连通分量的数量
     *
     * @return
     */
    public int count() {
        return count;
    }

    /**
     * 判断p和q是否在同一个分量中
     *
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    /**
     * 归并分量
     *
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        id[pRoot] = qRoot;
        for(int i = 0;i < 10;i++){
            System.out.println(id[i]);
        }
        count--;
    }
}
