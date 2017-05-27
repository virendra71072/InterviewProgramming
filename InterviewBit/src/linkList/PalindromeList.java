package linkList;

import java.util.Stack;

public class PalindromeList {
  class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
      this.val = val;
    }
  }
  public int lPalin(ListNode A) {
    if (A == null)
      return 0;
    Stack<Integer> stack = new Stack<Integer>();
    int len = length(A);
    int i = 0;
    for (; i < len / 2; i++) {
      stack.push(A.val);
      A = A.next;
    }
    // for list with odd length
    if (len % 2 != 0) {
      A = A.next;
    }
    while (A != null) {
      if (A.val != stack.pop())
        return 0;
      A = A.next;
    }
    return 1;
  }
  private int length(ListNode node){
    int len = 0;
    while(node!=null){
        len++;
        node = node.next;
    }
    return len;
}
}
