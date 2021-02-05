package lc104;

/**
 * @author yuluyang
 * @date 2020/12/19 14:40
 * @since 1.0.0-SNAPSHOT
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
