package com.leetcode;

public class ������_009 {
    public static boolean isPalindrome(int x) {
        //С��0��Ϊ��ֱ�ӷ���false
        if (x < 0 || (x % 10) == 0) {
            return false;
        }
        //�������ĺ�벿�ַ�ת����ǰ�벿�ֽ��жԱ�
        int rev = 0;
        while(x > rev) {
            rev = x % 10 + rev * 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;//ż��ֻ��Ҫ�Աȴ�С������ȥ�����һλ
    }
    
    public static void main(String[] args) {
        int x = 123454321;
        System.out.println(isPalindrome(x));
    }
}
