package org.clb.LeetCode.code1_10;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * ����һ�������� n ���ҳ��������������� �������� x ��
 * 1 �� x ֮�������Ԫ��֮�͵��� x �� n ֮������Ԫ��֮�͡�
 * ������������ x ����������������������򷵻� -1 ����Ŀ��֤���ڸ��������룬�������һ������������
 */
public class Code_2485 {

    public static void main(String[] args) {

        System.out.println(pivotInteger(4));
    }
    public static int pivotInteger(int n) {
        double x=0;
        x= Math.pow((n*n+n)/2,0.5);
        if ((int)x==x) {
            return (int)x;
        } else {
            return -1;
        }
    }
}
