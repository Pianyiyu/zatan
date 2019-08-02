package com.zah;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//        有效字符串需满足：
//
//        左括号必须用相同类型的右括号闭合。
//        左括号必须以正确的顺序闭合。
//        注意空字符串可被认为是有效字符串。

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("[])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && (chars[i] == '}' || chars[i] == ')' || chars[i] == ']')) {
                return false;
            }
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            } else if (chars[i] == ']') {
                if (stack.isEmpty() || stack.pop() != '[')
                    return false;
            } else if (chars[i] == '}') {
                if (stack.isEmpty() || stack.pop() != '{')
                    return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
