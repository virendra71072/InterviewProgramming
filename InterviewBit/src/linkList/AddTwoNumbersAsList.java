package linkList;

/*
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8

        342 + 465 = 807
        Make sure there are no trailing zeros in the output list
        So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.*/
public class AddTwoNumbersAsList {
    public static void main(String[] args) {

        ListNode number1 = new ListNode(9);
        number1.next = new ListNode(9);
        number1.next.next = new ListNode(1);

        ListNode number2 = new ListNode(1);

        ListNode result = addTwoNumbers(number1, number2);
        printNumber(result);
    }

    private static void printNumber(ListNode number) {
        if (number == null)
            return;
        while (number != null) {
            System.out.print(number.val);
            number = number.next;
        }
        System.out.println();
    }

    private static ListNode addTwoNumbers(ListNode number1, ListNode number2) {

        if (number1 == null)
            return number2;
        if (number2 == null)
            return number1;
        ListNode temp = new ListNode(0), result = temp;
        int carry = 0, sum = 0;
        while (number1 != null && number2 != null) {
            sum = number1.val + number2.val + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            number1 = number1.next;
            number2 = number2.next;
            temp = temp.next;
        }
        while (number1 != null) {
            sum = number1.val + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            number1 = number1.next;
            temp = temp.next;

        }
        while (number2 != null) {
            sum = number2.val + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            number2 = number2.next;
            temp = temp.next;
        }
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        return result.next;
    }
}
