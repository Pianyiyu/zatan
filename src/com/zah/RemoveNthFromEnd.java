package com.zah;

import com.zah.util.ListNode;

//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        removeNthFromEnd(listNode1, 5);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = null;
        ListNode low = new ListNode(-1);
        low.next = head;
        ListNode fast = head;
        int i = 0;
        while (fast.next != null) {
            fast = fast.next;
            i++;
            if (i == n ) {
                low = low.next;
                i -= 1;
            }
        }
        if (low.val == -1){
            return head.next;
        }
        pre = low;
        pre.next = low.next.next;
        low = null;

        return head;
    }
}
