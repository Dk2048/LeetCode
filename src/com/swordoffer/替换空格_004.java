package com.swordoffer;

public class 替换空格_004 {
    public static String replaceSpace(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int spacecount = 0;
        for(int i = 0; i < length; i++) {
            if(charArray[i] == ' ')
                spacecount++;
        }
        if(spacecount == 0)
            return str;
        char[] tmp = new char[length + spacecount * 2];//设置替换后长度
        for(int i = length -1, j = (tmp.length - 1); i >= 0 && j >= 0;) {
            //从原字符串的最后一位开始查找
            if (charArray[i] == ' ') {//遇到空格将空格替换成%20，并将j往前3位
                tmp[j--] = '0';//替换后前移1位
                tmp[j--] = '2';
                tmp[j--] = '%';
            } else {//其他字符直接赋值前移
                tmp[j--] = charArray[i];
            }
            i--;
        }
        return new String(tmp);
    }
    public static void main(String[] args) {
        String str="We are happy";
        System.out.println(replaceSpace(str));
    }
}
