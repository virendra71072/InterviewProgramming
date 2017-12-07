package backtracking;

import linkList.ListNode;
/*
Reverse a linked list using recursion.

        Example :
        Given 1->2->3->4->5->NULL,

        return 5->4->3->2->1->NULL.*/
public class ReverseList {

    ListNode reverseListNode(ListNode a){

        ListNode curr = a, temp = null, prev = null;
        while(curr!=null){
            temp = curr.next;
            curr = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
