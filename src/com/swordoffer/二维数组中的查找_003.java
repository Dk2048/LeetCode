package com.swordoffer;

public class 二维数组中的查找_003 {
    public static void main(String[] args) {
        int[][] array = new int[][] {
            {1, 2, 8, 9},
            {2, 4, 9, 12},
            {4, 7, 10, 13},
            {6, 8, 11, 15}
        };
        System.out.println(find1(array, 9));
        System.out.println(find2(array, 5));
    }
    //遍历法，2层for循环进行查找
    private static boolean find1(int[][] array, int target) {
        // TODO Auto-generated method stub
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if (target == array[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
    //从左下角开始查找，比target小向上移动，比target大向右移动
    private static boolean find2(int[][] array, int target) {
        int row = array.length - 1;
        int col = 0;
        while (row >= 0 && col < array[0].length) {
            if (target == array[row][col]) {
                return true;
            } else if (target < array[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }
}
