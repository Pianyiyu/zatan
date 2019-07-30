package com.zah;

import com.zah.util.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<Integer>();
        ListNode p=listNode;
        while (p!=null){
            stack.push(p.val);
            p=p.next;
        }
        while (!stack.isEmpty())
            list.add(stack.pop());
        return list;
    }
}
