package com.zah;

import java.util.AbstractCollection;

public class JumpFloorII {

    int jumpFloorII(int number) {
        if (number == 0)return 0;

        if (number == 0)return 0;
        if (number==1) return 1;
        return 2*jumpFloorII(number-1);
    }
}
