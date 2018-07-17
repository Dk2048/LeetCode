package com.leetcode;

public class ��������ת����_013 {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = getNumber(s.charAt(0));//������λ��ֵ
        for(int i = 0; i < s.length() - 1; i++) {
            if (getNumber(s.charAt(i + 1)) > getNumber(s.charAt(i))) {
                //��һλ����ǰһλʱ����Ϊ������2�Σ���ȥǰһλ *2 ��ֵ
                result += getNumber(s.charAt(i + 1)) - 2 * getNumber(s.charAt(i));
            } else {
                result += getNumber(s.charAt(i + 1));
            }
        }
        return result;
    }
    public static int getNumber(char c) {
        int result = 0;
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            break;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
