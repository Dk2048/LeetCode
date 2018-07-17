package com.leetcode;

public class 最长公共前缀_014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        int i = 0;
        while (i < strs[0].length()) {
            char c = strs[0].charAt(i);//取出每次检测的字母
            for(String s : strs) {
                if (c != s.charAt(i) || i == s.length()) {//不同或长度与字符串相等时跳出
                    if (i == 0) {//判断是否0公共前缀
                        return null;
                    } else {
                        return s.substring(0, i);
                    }
                }
            }
            i++;
        }
        return null;
    }
    public static void main(String[] args) {
        String[] s = {"flow","flower","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
