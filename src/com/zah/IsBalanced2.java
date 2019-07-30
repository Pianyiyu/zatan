package com.zah;

import com.zah.util.TreeNode;

public class IsBalanced2 {

    public boolean IsBalanced_Solution(TreeNode root) {

        if (root==null) return true;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.abs(left-right)<=1&&IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }

    public static int getHeight(TreeNode root) {

        if (root == null) return 0;
        else return  1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}
