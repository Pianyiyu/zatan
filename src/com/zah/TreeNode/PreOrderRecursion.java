package com.zah.TreeNode;

import com.zah.util.TreeNode;

import java.util.Stack;

public class PreOrderRecursion {

    public void preOrderRecursion_dg(TreeNode node) {
        if (node == null) return;
        while (node != null) {
            System.out.println(node.val);
            preOrderRecursion_dg(node.left);
            preOrderRecursion_dg(node.right);
        }
    }

    public void preOrderRecursion(TreeNode node) {
        if (node == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(node);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.val);
            if (temp.right!=null) stack.add(temp.right);
            if (temp.left!=null)stack.add(temp.left);
        }
    }
}
