package com.zah;

import com.zah.util.ListNode;

public class ReverseListNode {
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=null;
        reverse(listNode1);
    }
    public static ListNode reverse(ListNode root) {
        if (root == null) return null;
        ListNode pre = null;
        ListNode next = null;
        while (root != null) {
            next = root.next;
            root.next = pre;

            pre=root;
            root=next;
        }

        return pre;
    }
}
