package trees;

public class BinaryTreeFromInAndPostOrder {

    public static void main(String[] args) {
        TreeNode root = new BinaryTreeFromInAndPostOrder().
                construct(new int[]{2, 1, 3}, new int[]{1, 2, 3});
    }

    private  TreeNode construct(int[] inOrder, int[] postOrder) {
        return buildTree(inOrder, 0, inOrder.length-1, postOrder, 0, postOrder.length-1);
    }

    private  TreeNode buildTree(int[] inOrder, int inStart, int inEnd,
                                      int[] postOrder, int postStart, int postEnd) {

        if (inStart>inEnd || postStart>postEnd){
            return  null;
        }

        int rootValue = postOrder[postEnd];
        TreeNode rootNode = new TreeNode(rootValue);
        int rootIndex = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if(rootValue == inOrder[i]){
                rootIndex = i;
                break;
            }
        }

        rootNode.left = buildTree(inOrder, inStart, rootIndex-1,
                                  postOrder, postStart, postStart+rootIndex-(inStart+1));

        rootNode.right = buildTree(inOrder, rootIndex+1, inEnd,
                                   postOrder, postStart+rootIndex-inStart,postEnd-1 );

        return rootNode;
    }
}
