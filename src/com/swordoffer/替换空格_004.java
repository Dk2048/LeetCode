package com.swordoffer;

public class �滻�ո�_004 {
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
        char[] tmp = new char[length + spacecount * 2];//�����滻�󳤶�
        for(int i = length -1, j = (tmp.length - 1); i >= 0 && j >= 0;) {
            //��ԭ�ַ��������һλ��ʼ����
            if (charArray[i] == ' ') {//�����ո񽫿ո��滻��%20������j��ǰ3λ
                tmp[j--] = '0';//�滻��ǰ��1λ
                tmp[j--] = '2';
                tmp[j--] = '%';
            } else {//�����ַ�ֱ�Ӹ�ֵǰ��
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
