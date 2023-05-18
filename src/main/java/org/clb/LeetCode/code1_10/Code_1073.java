package org.clb.LeetCode.code1_10;

import java.util.*;

/**
 * 给出基数为 -2 的两个数 arr1 和 arr2，返回两数相加的结果。
 * 数字以 数组形式 给出：数组由若干 0 和 1 组成，按最高有效位到最低有效位的顺序排列。
 * 例如，arr = [1,1,0,1] 表示数字 (-2)^3 + (-2)^2 + (-2)^0 = -3。数组形式 中的数字 arr 也同样不含前导零：
 * 即 arr == [0] 或 arr[0] == 1。
 * 返回相同表示形式的 arr1 和 arr2 相加的结果。两数的表示形式为：不含前导零、由若干 0 和 1 组成的数组。
 * 输入：arr1 = [1,1,1,1,1], arr2 = [1,0,1]
 * 输出：[1,0,0,0,0]
 * 解释：arr1 表示 11，arr2 表示 5，输出表示 16 。
 */
public class Code_1073 {
    public static int[] addNegabinary(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length = Math.max(length1,length2);
        int index = 1;
        List<Integer> list  = new LinkedList<>();
        int last = 0;
        while (index<length) {

            int a = index<length1?arr1[length1-index]:0;
            int b = index<length2?arr2[length2-index]:0;
            int sum = a+b+last;
            Integer res = 0;
            switch (sum) {
                case 0:res=0;last=0;break;
                case 1:res=1;last=0;break;
                case 2:res=0;last=-1;break;
                default:
                    System.out.println("错误");
            }
            list.add(res);
            index++;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] ints = addNegabinary(new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 1});
        //0 0 0 0 1
        for (int anInt : ints) {
            System.out.println(anInt);
        }// 100 =  1 1 0 2 0
        // 1 0 1   ||  1           0 -1 1 0  ||   -1  0   1 0 2 0
        //    16 -8 4 -2 1
        //     1  1 0  1 0
    }
}
