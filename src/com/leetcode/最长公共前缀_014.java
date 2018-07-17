package com.leetcode;

public class 最长公共前缀_014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int i = 0;
        do {
            if(i == strs[0].length()) {
                return strs[0].substring(0, i);
            }
            char c = strs[0].charAt(i);//取出每次检测的字母
            for(String s : strs) {
                if (i == s.length()) {
                    return s.substring(0, i);
                }
                if (s.charAt(i) != c) {//不同或长度与字符串相等时跳出
                    if (i == 0) {//判断是否0公共前缀
                        return "";
                    }
                    return s.substring(0, i);
                }
            }
            i++;
        } while (i != (strs[0].length()));
        return strs[0].substring(0, i);
    }
    public static void main(String[] args) {
        String[] s = {"",""};
        System.out.println(longestCommonPrefix(s));
    }
}
