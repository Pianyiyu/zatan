package com.zah.TreeNode;

import com.zah.util.TreeNode;

import java.util.Stack;

public class InOrderRecursion {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(3);
        head.right = new TreeNode(8);
        head.left.left = new TreeNode(2);
        head.left.right = new TreeNode(4);
        head.left.left.left = new TreeNode(1);
        head.right.left = new TreeNode(7);
        head.right.left.left = new TreeNode(6);
        head.right.right = new TreeNode(10);
        head.right.right.left = new TreeNode(9);
        head.right.right.right = new TreeNode(11);

        inOrderRecursion(head);

    }

    public static void inOrderRecursion_dg(TreeNode root) {
        if (root == null) return;
        while (root != null) {
            inOrderRecursion_dg(root.left);
            System.out.println(root.val);
            inOrderRecursion_dg(root.left);
        }
    }

    public static void inOrderRecursion(TreeNode node) {
        if (node != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(node);
            while (!stack.isEmpty() || node != null) {
                if (node != null) {
                    stack.add(node);
                    node = node.left;
                } else {
                    node = stack.pop();
                    System.out.println(node.val);
                    node = node.right;
                }
            }
        }
    }
}
