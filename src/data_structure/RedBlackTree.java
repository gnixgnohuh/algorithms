package data_structure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: gnixgnohuh
 * @date : 18-3-6
 * @time : 下午2:29
 * @desc :
 */
public class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private Node root;

    private class Node {
        private Object key;
        private Object value;
        private Node left, right;
        private int N;
        boolean color;

        public Node(Object key, Object value, int N, boolean color) {
            this.key = key;
            this.value = value;
            this.N = N;
            this.color = color;
        }


    }

    public int size() {
        return size(root);
    }

    public int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.N;
    }

    public boolean isRed(Node node) {
        if (node == null) {
            return false;
        }
        return node.color = RED;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        x.N = h.N;
        h.N = 1 + size(h.left) + size(h.right);
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;

        x.color = h.color;
        h.color = RED;
        x.N = h.N;
        h.N = 1 + size(h.left) + size(h.right);
        return x;
    }

    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>(4);
//        map.put(1,2);
//        map.put(4,5);
//        map.put(1,3);
//        map.put(4,8);
        String i = "467454335";
        System.out.println(i.hashCode());
    }
}
