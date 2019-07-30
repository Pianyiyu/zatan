package com.zah;

public class KMP {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = "abababdafdasabcfdfeaba";
        String pattern = "abc";
        System.out.println(kmp(str, pattern));
    }

    public static void generateNext(String s, int[] next) {
        int k = -1;
        int j = 0;
        next[0] = -1;
        while (j < s.length() - 1) {
            if (k == -1 || next[k] == next[j]) {
                j++;
                k++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
    }
    public static int kmp(String s1, String s2) {
        int s1len = s1.length();
        int s2len = s2.length();
        int i = 0;
        int j = 0;
        int[] next = new int[s2len];
        generateNext(s2, next);
        while (i < s1len && j < s2len) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (next[j] == -1) {
                    i++;
                    j = 0;
                } else {
                    j = next[j];
                }
            }
            if (j == s2len) {
                return i - j;
            }
        }
        return -1;
    }
}
