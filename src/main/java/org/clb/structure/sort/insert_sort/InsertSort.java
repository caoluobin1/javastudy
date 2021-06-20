package org.clb.structure.sort.insert_sort;

/**
 * @Description
 * @Classname InsertSort
 * @Date 2021/6/13 17:10
 * @Author clb
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 2, 10, 9, 7};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (a[j + 1] < a[j]) {
                    int b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }
    }
}
