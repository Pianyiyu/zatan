package com.zah;

import java.util.Arrays;
import java.util.Comparator;


//        给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
//
//        注意:
//
//        可以认为区间的终点总是大于它的起点。
//        区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠
public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals,new Comparator<int [] >(){
            public int compare(int [] a1,int [] a2) {
                return a1[1] - a2[1];   //升序排列
            }
        });
        int count = 1;	//最多能组成的不重叠区间个数
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            count++;
        }
        return intervals.length - count;

    }
}
