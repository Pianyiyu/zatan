package com.zah.TreeNode;

import com.zah.util.TreeNode;

import java.util.Stack;

public class PosOrderRecursion {

    public static void posOrderUnRecur1(TreeNode head) {
        System.out.print("pos-order: ");
        if (head != null) {
            Stack<TreeNode> s1 = new Stack<TreeNode>();
            Stack<TreeNode> s2 = new Stack<TreeNode>();
            s1.push(head);
            while (!s1.isEmpty()) {
                head = s1.pop();
                s2.push(head);
                if (head.left != null) {
                    s1.push(head.left);
                }
                if (head.right != null) {
                    s1.push(head.right);
                }
            }
            while (!s2.isEmpty()) {
                System.out.print(s2.pop().val + " ");
            }
        }
        System.out.println();
    }
}
