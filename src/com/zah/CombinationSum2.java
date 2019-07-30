package com.zah;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
//        candidates 中的每个数字在每个组合中只能使用一次。
public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(candidates);
        combin2(candidates, target, new ArrayList<>(), 0, lists);
        return lists;
    }

    public static void combin2(int[] candaties, int target, List<Integer> list, int index, List<List<Integer>> lists) {
        if (target == 0) {
            lists.add(new ArrayList<>(list));
            return;
        } else if (target < 0) {
            return;
        } else {
            for (int i = index; i < candaties.length && candaties[i] <= target; i++) {
                if (i != index && candaties[i] == candaties[i - 1])
                    continue;
                list.add(candaties[i]);
                combin2(candaties, target - candaties[i], list, i + 1, lists);
                list.remove(list.size() - 1);
            }
        }
    }


//
//    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        List<List<Integer>> res=new ArrayList<>();
//        if (candidates==null||candidates.length==0) return res;
//        Arrays.sort(candidates);
//        helper(candidates,target,res,new ArrayList<>(),0);
//        return res;
//    }
//    private static void helper(int[] candidates,int target,List<List<Integer>> res,List<Integer> temp,
//                        int start){
//        if (target==0){
//            res.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = start; i < candidates.length&&candidates[i]<=target; i++) {
//            if (i!=start&&candidates[i]==candidates[i-1]){
//                continue;
//            }
//            temp.add(candidates[i]);
//            helper(candidates,target-candidates[i],res,temp,i+1);
//            temp.remove(temp.size()-1);
//        }
//    }
}
