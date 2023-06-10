import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class BinaryTree {
    @Test
    public void testTreeNodeToString() {
        TreeNode root = TreeNode.creatTreeNode(new Integer[] {1,2,3,4,5});
        String result = TreeNode.toString(root);
        assertEquals("12453", result);
    }

    @Test
    public void testTreeNodeToArray() {
        TreeNode root = TreeNode.creatTreeNode(new Integer[] {1,2,3,4,5,6,7});
        int[] result = TreeNode.toArray(root);
        // Arrays.sort(result);
        assertArrayEquals(new int[]{1,2,4,5,3,6,7}, result);
    }

    @Test
    public void testBSTIterator() {
        TreeNode root = TreeNode.creatTreeNode(new Integer[] {7,3,15,null,null,9,20});
        BSTIterator it = new BSTIterator(root);
        assertEquals(true, it != null);
        int next = it.next();
        assertEquals(3, next);
        next = it.next();
        assertEquals(7, next);
        boolean hasNext = it.hasNext();
        assertEquals(true, hasNext);
        next = it.next();
        assertEquals(9, next);
        hasNext = it.hasNext();
        assertEquals(true, hasNext);
        next = it.next();
        assertEquals(15, next);
        hasNext = it.hasNext();
        assertEquals(true, hasNext);
        next = it.next();
        assertEquals(20, next);
        hasNext = it.hasNext();
        assertEquals(false, hasNext);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    private static String result = "";
    private static void createString(TreeNode root) {
        if(root != null) {
            result = result.concat(String.valueOf(root.val));
            createString(root.left);
            createString(root.right);
        }
    }

    public static String toString(TreeNode root) {
        createString(root);
        return result;
    }

    public static TreeNode creatTreeNode(Integer[] arr) {
        return fromArray(arr, 0);
    }

    private static Queue<Integer> qu = new LinkedList<>();
    public static int[] toArray(TreeNode root) {
        createArray(root);
        int[] arr = new int[qu.size()];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = qu.poll();
        }
        return arr;
    }

    private static void createArray(TreeNode root) {
        if(root != null) {
            qu.add(root.val);
            createArray(root.left);
            createArray(root.right);
        }
    }

    private static TreeNode fromArray(Integer[] arr, int i) {
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.length && arr[i] != null) {
            root = new TreeNode(arr[i]);
  
            // insert left child
            root.left = fromArray(arr, 2 * i + 1);
  
            // insert right child
            root.right = fromArray(arr, 2 * i + 2);
        }
        return root;
    }

}
//[3,7,null,15,9,20]
class BSTIterator {
    private Queue<Integer> qu = new LinkedList<>();
    public BSTIterator(TreeNode root) {
        addToQueue(root);
    }

    private void addToQueue(TreeNode root) {
        if(root == null) return;
        addToQueue(root.left);
        qu.add(root.val);
        addToQueue(root.right);
    }
    
    public int next() {
        return qu.poll();
    }
    
    public boolean hasNext() {
        return !qu.isEmpty() && qu.peek() != null;
    }
}