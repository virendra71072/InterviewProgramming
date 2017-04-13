package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
Both the left and right subtrees must also be binary search trees.
Example :

Input : 
   1
  /  \
 2    3

Output : 0 or False

Input : 
  2
 / \
1   3

Output : 1 or True 
Return 0 / 1 ( 0 for false, 1 for true ) for this problem*/
public class ValidBinarySearchTree {
  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public int isValidBST(TreeNode a) {
    List<Integer> result = inOrder(a);
    int i = result.size() - 1;
    while (i > 0) {
      if (result.get(i) <= result.get(i - 1))
        return 0;
      i--;
    }
    return 1;
  }

  private List<Integer> inOrder(TreeNode node) {
    List<Integer> result = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<>();
    while (true) {
      while (node != null) {
        stack.push(node);
        node = node.left;
      }
      if (stack.isEmpty())
        break;
      TreeNode temp = stack.pop();
      result.add(temp.val);
      node = temp.right;
    }
    return result;
  }
}
