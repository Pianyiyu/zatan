package com.zah;

import java.util.ArrayList;

public class YueseFuhuan {
    /***
     * 约瑟夫环：已知n个人(以编号1，2，3...n分别表示)围坐在一张圆桌周围。
     * 从编号为k的人开始报数，数到m的那个人出列;他的下一个人又从1开始报数，
     * 数到m的那个人又出列;依此规律重复下去，直到圆桌周围的人全部出列。
     * @param n
     * @param k
     * @param k
     */
    public static void  yuesefu(int n,int k,int m){
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            list.add(i);
        }
        while (list.size()>0){
            for (int i = 0; i < m - 1; i++) {
                list.add(list.remove(k));
            }
            System.out.println(list.remove(k));
        }
    }
}
