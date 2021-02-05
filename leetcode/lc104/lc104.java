package lc104;

/**
 * @author yuluyang
 * @date 2020/12/19 14:40
 * @since 1.0.0-SNAPSHOT
 */
public class lc104 {

}


class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
