package trees;

import java.util.Stack;

/*
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

        The first call to next() will return the smallest number in BST. Calling next() again will return the next smallest number in the BST, and so on.

        Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
        Try to optimize the additional space complexity apart from the amortized time complexity.
        See Expected Output
*/

public class BSTIterator {

    Stack<TreeNode> stack;
    TreeNode current = null;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        current = root;
    }

    public boolean hasNext(){
        return !stack.isEmpty() || current!=null;
    }

    public int next(){
        while (current!=null){
            stack.push(current);
            current = current.left;
        }
        TreeNode smallest = stack.pop();
        current = current.right;
        return smallest.val;
    }
}
