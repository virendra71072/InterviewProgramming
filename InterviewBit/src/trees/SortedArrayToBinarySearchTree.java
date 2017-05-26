package trees;

import java.util.List;

public class SortedArrayToBinarySearchTree {

  class TreeNode {
    TreeNode left;
    TreeNode right;
    int data;
    public TreeNode(int data) {
      this.data = data;
    }
    
  }
  public TreeNode sortedArrayToBST(final List<Integer> a) {
    return recursive(a,0,a.size());
}

private TreeNode recursive(List<Integer> list, int start, int end){
    
    if(start>end)
        return null;
    int mid = (start+end)/2;
    TreeNode node = new TreeNode(list.get(mid));
    node.left = recursive(list,start,mid-1);
    node.right = recursive(list,mid+1,end);
    
    return node;
}
}
