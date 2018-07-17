package com.leetcode;

public class 罗马数字转整数_013 {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = getNumber(s.charAt(0));//先算首位的值
        for(int i = 0; i < s.length() - 1; i++) {
            if (getNumber(s.charAt(i + 1)) > getNumber(s.charAt(i))) {
                //后一位大于前一位时，因为计算了2次，减去前一位 *2 的值
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
