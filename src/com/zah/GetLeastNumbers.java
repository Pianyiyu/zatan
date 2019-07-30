package com.zah;

import java.util.*;

public class GetLeastNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(GetLeastNumbers_Solution(arr, 3));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (k > input.length || k == 0) return list;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() < k)
                maxHeap.offer(input[i]);
            else {
                if (maxHeap.peek() > input[i]) {
                    maxHeap.poll();
                    maxHeap.offer(input[i]);
                }
            }
        }

        while (!maxHeap.isEmpty()) {
            list.add(maxHeap.poll());
        }
        Collections.sort(list);
        return list;
    }
}
