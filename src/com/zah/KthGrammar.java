package com.zah;
//        在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
//
//        给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）

//        第一行: 0
//        第二行: 01
//        第三行: 0110
//        第四行: 01101001
public class KthGrammar {
    public static void main(String[] args) {
        System.out.println(kthGrammar(3,4));
    }
    public static int kthGrammar(int N, int K) {
        if(N==1) return 0;
        if(K%2==0) return (kthGrammar(N-1,K/2)==0)?1:0;
        else return (kthGrammar(N-1,(K+1)/2)==0)?0:1;
    }
}
