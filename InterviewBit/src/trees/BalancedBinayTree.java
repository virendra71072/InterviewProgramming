package trees;

public class BalancedBinayTree {

  class TreeNode {
    TreeNode left;
    TreeNode right;
    TreeNode data;
  }

  public class Solution {
    public int isBalanced(TreeNode root) {

      int result = checkBalanced(root);
      if (result > 0) {
        return 1;
      } else {
        return 0;
      }
    }

    private int checkBalanced(TreeNode root) {
      if (root == null) {
        return 0;
      }
      int leftH = checkBalanced(root.left);
      if (leftH == -1) {
        return -1;
      }
      int rightH = checkBalanced(root.right);
      if (rightH == -1) {
        return -1;
      }
      int diff = leftH - rightH;
      if (Math.abs(diff) > 1) {
        return -1;
      }
      return 1 + Math.max(leftH, rightH);
    }
  }
}
