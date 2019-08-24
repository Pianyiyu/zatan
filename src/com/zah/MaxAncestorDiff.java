package com.zah;

import com.zah.util.TreeNode;

public class MaxAncestorDiff {

//    给定二叉树的根节点 root，找出存在于不同节点 A 和 B 之间的最大值 V，其中 V = |A.val - B.val|，且 A 是 B 的祖先。
//
//            （如果 A 的任何子节点之一为 B，或者 A 的任何子节点是 B 的祖先，那么我们认为 A 是 B 的祖先）

    public int maxAncestorDiff(TreeNode root) {

        if (root == null) return 0;
        int left = max(root.left, root.val, root.val);
        int right = max(root.right, root.val, root.val);
        return left > right ? left : right;
    }

    public int max(TreeNode root , int max , int min){

        if (root == null ){
            return 0;
        }
        if(root.val > max){
            max = root.val;
        }else if (root.val < min){
            min = root.val;
        }
        if(root.left == null && root.right == null){
            return max - min;
        }
        int left = max(root.left, max, min);
        int right = max(root.right, max, min);
        return left > right ? left : right;

    }


}
