package LinkList;

/*Sort a linked list in O(n log n) time using constant space complexity.

Example :

Input : 1 -> 5 -> 4 -> 3

Returned list : 1 -> 3 -> 4 -> 5*/
public class SortList {
  class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode sortList(ListNode node) {
    if (node == null || node.next == null)
      return node;
    ListNode prev = null, slow = node, fast = node;

    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prev.next = null;

    ListNode l1 = sortList(node);
    ListNode l2 = sortList(slow);

    return merge(l1, l2);
  }

  private ListNode merge(ListNode l1, ListNode l2) {
    ListNode l = new ListNode(0), prev = l;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        prev.next = l1;
        l1 = l1.next;
      } else {
        prev.next = l2;
        l2 = l2.next;
      }
      prev = prev.next;
    }
    if (l1 != null) {
      prev.next = l1;
    }
    if (l2 != null) {
      prev.next = l2;
    }

    return l.next;
  }
}
