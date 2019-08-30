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

    public void pre(TreeNode root){
        if (root != null){
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || root != null){
                while (root != null){
                    System.out.println(root.val);
                    stack.push(root);
                    root = root.left;
                }
                if (!stack.isEmpty()){
                    root =  stack.pop();
                    root = root.right;
                }

            }
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

    // 非递归中序遍历
    public static void middleorderTraversal(TreeNode root) {
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                treeNodeStack.push(node);
                node = node.left;
            }
            if (!treeNodeStack.isEmpty()) {
                node = treeNodeStack.pop();
                System.out.print(node.val + " ");
                node = node.right;
            }
        }
    }

    // 非递归先序遍历
    public static void preorderTraversal(TreeNode root) {
        // 用来暂存节点的栈
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        // 新建一个游标节点为根节点
        TreeNode node = root;
        // 当遍历到最后一个节点的时候，无论它的左右子树都为空，并且栈也为空
        // 所以，只要不同时满足这两点，都需要进入循环
        while (node != null || !treeNodeStack.isEmpty()) {
            // 若当前考查节点非空，则输出该节点的值
            // 由考查顺序得知，需要一直往左走
            while (node != null) {
                System.out.print(node.val + " ");
                // 为了之后能找到该节点的右子树，暂存该节点
                treeNodeStack.push(node);
                node = node.left;
            }
            // 一直到左子树为空，则开始考虑右子树
            // 如果栈已空，就不需要再考虑
            // 弹出栈顶元素，将游标等于该节点的右子树
            if (!treeNodeStack.isEmpty()) {
                node = treeNodeStack.pop();
                node = node.right;
            }
        }
    }
}
