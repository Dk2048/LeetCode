package com.leetcode;

public class �����ǰ׺_014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        int i = 0;
        while (i < strs[0].length()) {
            char c = strs[0].charAt(i);//ȡ��ÿ�μ�����ĸ
            for(String s : strs) {
                if (c != s.charAt(i) || i == s.length()) {//��ͬ�򳤶����ַ������ʱ����
                    if (i == 0) {//�ж��Ƿ�0����ǰ׺
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
