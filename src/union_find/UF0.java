package union_find;

/**
 * @author: gnixgnohuh
 * @date : 17-12-27
 * @time : 下午3:03
 * @desc : 算法复杂度O(n2)，平方级别
 */
public class UF0 {
    private int[] id;
    private int count;

    public UF0(int count) {
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

    /**
     * 获取指定点所在的分量id
     *
     * @param p
     * @return
     */
    public int find(int p) {
        return id[p];
    }

    /**
     * 归并分量
     *
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) {
            return;
        }

        //将p所在分量下的所有触点都合并到q所在分量下
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
        count--;
    }

}
