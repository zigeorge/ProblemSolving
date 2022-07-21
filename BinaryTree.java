import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTree {


    @Test
    public void testTreeNodeToString() {
        TreeNode root = TreeNode.creatTreeNode(new int[] {1,2,3,4,5});
        String result = TreeNode.toString(root);
        assertEquals("12345", result);
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
            createString(root.left);
            result = result.concat(String.valueOf(root.val));
            createString(root.right);
        }
    }

    public static String toString(TreeNode root) {
        createString(root);
        return result;
    }

    public static TreeNode creatTreeNode(int[] arr) {
        return fromArray(arr, 0);
    }

    private static TreeNode fromArray(int[] arr, int i) {
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.length) {
            root = new TreeNode(arr[i]);
  
            // insert left child
            root.left = fromArray(arr, 2 * i + 1);
  
            // insert right child
            root.right = fromArray(arr, 2 * i + 2);
        }
        return root;
    }

}