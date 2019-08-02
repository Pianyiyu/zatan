package com.zah;

import java.util.ArrayList;
import java.util.List;

//给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
//        例如，给出 n = 3，生成结果为：
//        [
    //        "((()))",
    //        "(()())",
    //        "(())()",
    //        "()(())",
    //        "()()()"
//        ]

public class GenerateParenthesis {
//    正确的思考方式是采用DFS。
//
//    1、如果左括号还能括就不断的画左括号，直到左括号的数量等于n。
//    2、接下来考虑右括号，因为对于一对括号，右括号不能出现在左括号前，所以当右括号数量小于左括号时，加上右括号。
//    3、当左右括号数量都等于n时，得到解。
    public List<String> generateParenthesis(int n) {
        ArrayList<String> strings = new ArrayList<String>();
        if (n == 0) return strings;

        dfs(0, 0, "", strings, n);

        return strings;
    }

    private void dfs(int left, int right, String buffer, ArrayList<String> strings, int n) {
        if (left == n && right == n) {
            strings.add(buffer);
            return;
        }

        if (left < n) {
            dfs(left + 1, right, buffer + "(", strings, n);
        }

        if (left > right) {
            dfs(left, right + 1, buffer + ")", strings, n);
        }
    }
}
