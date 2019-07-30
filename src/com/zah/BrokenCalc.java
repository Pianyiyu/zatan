package com.zah;

//X->Y  有两种方法
//1、*2
//2、+1

public class BrokenCalc {


    public static void main(String[] args) {
        System.out.println(brokenCalc(2,3));
    }

    public static int brokenCalc(int X, int Y) {
        if (X>=Y){
            return X-Y;
        }else {
            if (Y%2==0)
                return brokenCalc(X,Y/2)+1;
            else
                return brokenCalc(X,Y+1)+1;
        }
    }
}
