package com.zah;

import com.zah.util.ListNode;

public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int m, int n) {
//        // Empty list
//        if (head == null) {
//            return null;
//        }
//        // Move the two pointers until they reach the proper starting point
//        // in the list.
//        ListNode cur = head, prev = null;
//        while (m > 1) {
//            prev = cur;
//            cur = cur.next;
//            m--;
//            n--;
//        }
//        // The two pointers that will fix the final connections.
//        ListNode con = prev, tail = cur;
//        // Iteratively reverse the nodes until n becomes 0.
//        ListNode third = null;
//        while (n > 0) {
//            third = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = third;
//            n--;
//        }
//        // Adjust the final connections as explained in the algorithm
//        if (con != null) {
//            con.next = prev;
//        } else {
//            head = prev;
//        }
//        tail.next = cur;
//        return head;
        ListNode pre=null;
        ListNode cur=head;
        while (m>1){
            pre=cur;
            cur=cur.next;
            m--;
            n--;
        }

        ListNode con=pre;
        ListNode tail=cur;
        while (n>0){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
            n--;
        }

        if (con!=null){
            con.next=pre;
        }else {
            head=pre;
        }
        tail.next=cur;

        return head;
    }
}
