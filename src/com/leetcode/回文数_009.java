package com.leetcode;

public class 回文数_009 {
    public static boolean isPalindrome(int x) {
        //小于0或为负直接返回false
        if (x < 0 || (x % 10) == 0) {
            return false;
        }
        //把整数的后半部分反转，与前半部分进行对比
        int rev = 0;
        while(x > rev) {
            rev = x % 10 + rev * 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;//偶数只需要对比大小，奇数去掉最后一位
    }
    
    public static void main(String[] args) {
        int x = 123454321;
        System.out.println(isPalindrome(x));
    }
}
