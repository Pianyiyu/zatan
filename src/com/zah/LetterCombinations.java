package com.zah;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    String digit = "";
    List<String> list = new ArrayList<>();
    Map<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) return list;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        digit = digits;
        backtrack(0, new StringBuilder());
        return list;
    }

    public void backtrack(int num, StringBuilder str) {
        if (num == digit.length()) list.add(str.toString());
        else {
            String newStr = map.get(digit.charAt(num));
            for (int i = 0; i < newStr.length(); i++) {
                str.append(newStr.charAt(i));
                backtrack(num + 1, str);
                str.delete(num, num + 1);
            }

        }
    }

}
