package com.leetcode;

public class 反转整数_007 {
    public static int reverse(int x) {
        long reslut = 0;//使用长整型存储结果，反转结束判断是否超出范围
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        while (x != 0) {
            reslut = reslut * 10 + x % 10;
            x /= 10;
        }
        if (reslut > imax || reslut < imin) {
            return 0;
        }
        return (int) reslut;
    }
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        System.out.println(reverse(x));
        x = 123456789;
        System.out.println(reverse(x));
    }
}
