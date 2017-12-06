package trees;
/*Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

        An example is the root-to-leaf path 1->2->3 which represents the number 123.

        Find the total sum of all root-to-leaf numbers % 1003.

        Example :

        1
        / \
        2   3
        The root-to-leaf path 1->2 represents the number 12.
        The root-to-leaf path 1->3 represents the number 13.

        Return the sum = (12 + 13) % 1003 = 25 % 1003 = 25.*/
public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode a){
        return preOrderSum(a,0)%1003;
    }

    private int preOrderSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        sum = (sum*10+root.val)%1003;
        if(root.left==null && root.right==null)
            return  sum;
        return preOrderSum(root.left,sum)+preOrderSum(root.right,sum);
    }
}
