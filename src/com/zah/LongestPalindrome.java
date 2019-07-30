package com.zah;

//最长回文子串
public class LongestPalindrome {

    public static void main(String[] args) {
//        System.out.println(longestPalindrome("aba"));
    }

//    public static String longestPalindrome(String s) {
//        if (s.isEmpty()) return null;
//        String result = s.substring(0, 1);
//        boolean[][] dp = new boolean[s.length()][s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            dp[i][i] = true;
//        }
//        for (int i = 0; i < s.length() - 1; i++) {
//            dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
//            if (dp[i][i + 1]) {
//                result = s.substring(i, i + 1 + 1);
//            }
//        }
//        for (int k = 3; k <= s.length(); k++) {
//            for (int i = 0; i + k <= s.length(); i++) {
//                    int j = i + k - 1;
//                dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
//                if (dp[i][j] && result.length() < j - i + 1) {
//                    result = s.substring(i, j + 1);
//                }
//            }
//        }
//        return result;
//
////        int len = s.length();
////        boolean[][] dp = new boolean[len][len];//<1>
////        String result = s.substring(0, 1);
////        for (int i = 0; i < len; i++) {
////            dp[i][i] = true;//<2>
////        }
////        for (int i = 0; i < len - 1; i++) {
////            dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);//<3>
////            if (dp[i][i + 1]) {
////                result = s.substring(i, i + 1 + 1);
////            }
////        }
////        //<4>
////        for (int k = 3; k <= len; k++) {
////            for (int i = 0; (i + k) <= len; i++) {
////                int j = i + k - 1;//<5>
////                dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
////                if (dp[i][j] && (j - i + 1) > result.length()) {//<6>
////                    result = s.substring(i, j + 1);
////                }
////            }
////        }
////        return result;
//    }

//    public String longestPalindrome(String s) {
//        int len = s.length();
//        boolean[][] dp = new boolean[len][len];
//        if (s.length() <= 0)
//            return "";
//        String result = s.substring(0, 1);
//        for (int i = 0; i < len; i++) {
//            dp[i][i] = true;
//        }
//        for (int i = 1; i < len; i++) {
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                dp[i - 1][i] = true;
//                result = s.substring(i - 1, i + 1);
//            }
//        }
//        for (int i = 3; i <= len; i++) {
//            for (int j = 0; j + i <= len; j++) {
//                int k = i + j - 1;
//                if (s.charAt(j) == s.charAt(k) && dp[j + 1][k - 1]) {
//                    dp[j][k] = true;
//                    result = s.substring(j, i + 1);
//                }
//            }
//
//        }
//
//        return result;
//    }
}
