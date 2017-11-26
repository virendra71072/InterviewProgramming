package stack;
/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

        push(x) – Push element x onto stack.
        pop() – Removes the element on top of the stack.
        top() – Get the top element.
        getMin() – Retrieve the minimum element in the stack.
        Note that all the operations have to be constant time operations.

        Questions to ask the interviewer :

        Q: What should getMin() do on empty stack?
        A: In this case, return -1.

        Q: What should pop do on empty stack?
        A: In this case, nothing.

        Q: What should top() do on empty stack?
        A: In this case, return -1
*/

public class MinStack {

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        System.out.println(stack.getMin());
    }


    Node head;

    private static class Node {
        int val, min;
        Node next;

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public void push(int val) {
        if (head == null) {
            head = new  Node(val,val);
        }else{
            head = new Node(val,Math.min(val,head.min), head);
        }
    }

    public void pop() {
        if(head==null)
            return;
        head = head.next;
    }

    public int top() {
        return head==null?-1:head.val;
    }

    public int getMin() {
        return head==null?-1:head.min;
    }
}
