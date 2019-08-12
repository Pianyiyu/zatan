package com.zah;

import com.zah.util.TreeNode;
//给定一个非空二叉树，返回其最大路径和。
//
//本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
public class MaxPathSum {
    private int res = -Integer.MAX_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }

    public int helper(TreeNode root){
        if (root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int maxSum = Math.max(Math.max(left+root.val,root.val +right),root.val);
        int maxCur = Math.max(maxSum,root.val +left+right);
        res = Math.max(res,maxCur);
        return maxSum;
    }
}
