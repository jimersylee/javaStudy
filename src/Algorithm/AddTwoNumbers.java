package Algorithm;

import java.util.LinkedList;
import java.util.Stack;


//2. Add Two Numbers
//        Medium
//
//        4418
//
//        1081
//
//        Favorite
//
//        Share
//        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.

public class AddTwoNumbers {


    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(3);
        ListNode l11 = new ListNode(4);
        l11.next = l1;
        ListNode l111 = new ListNode(2);
        l111.next = l11;

        ListNode l2 = new ListNode(4);
        ListNode l22 = new ListNode(6);
        l22.next = l2;
        ListNode l222 = new ListNode(5);
        l222.next = l22;
        ListNode ln = addTwoNumbers.AddTwoNumbers(l111, l222);
        //ListNode ln = addTwoNumbers.MyAddTwoNumbers(l111, l222);
        System.out.println(ln);
    }

    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        //pointer1,第一个链表的节点位置,pointer2:第二个链表的节点位置,currentNode:现在所处的节点
        ListNode pointer1 = l1, pointer2 = l2, currentNode = dummyHead;
        int carry = 0;//进位数,进1或者进0
        while (pointer1 != null || pointer2 != null) {
            int x = (pointer1 != null) ? pointer1.val : 0;
            int y = (pointer2 != null) ? pointer2.val : 0;
            int sum = x + y+carry;
            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (pointer1 != null) {
                pointer1 = pointer1.next;
            }
            if (pointer2 != null) {
                pointer2 = pointer2.next;
            }

        }

        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }

        return dummyHead.next;


    }

    public ListNode MyAddTwoNumbers(ListNode l1, ListNode l2) {
        double num1 = 0;
        double num2 = 0;
        int count = 0;
        ListNode tmp = l1;
        while (tmp != null) {
            num1 = num1 + tmp.val * Math.pow(10, count);
            count++;
            tmp = tmp.next;
        }
        System.out.println(num1);
        tmp = l2;
        count = 0;
        while (tmp != null) {
            num2 = num2 + tmp.val * Math.pow(10, count);
            count++;
            tmp = tmp.next;
        }
        System.out.println(num2);

        int sum = (int) (num1 + num2);
        int yu = sum % 10;
        //用一个栈来存数字
        Stack<Integer> stack = new Stack<Integer>();

        LinkedList<Integer> queue = new LinkedList<>();

        while (sum > 0) {
            Integer number = yu;
            stack.push(number);
            queue.add(number);
            //构建node,除10取余
            sum = sum / 10; //剩下的数
            System.out.println(yu);
            yu = sum % 10;

        }


        //从最末尾的节点开始


        //从第一个节点开始
        ListNode listNode = new ListNode(0);
        while (stack.peek() != null) {
            tmp = new ListNode(stack.pop());
            tmp.next = null;
            listNode.next = tmp;
            //不知道怎么写了
        }

        return listNode;


    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


