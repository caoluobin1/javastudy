package org.clb.structure.sort.simple_sort;

import org.clb.structure.sort.Sort;
import org.clb.structure.sort.SortType;

/**
 * @Description
 * @Classname InsertSort
 * @Date 2021/7/1 8:51
 * @Author clb
 */
public class InsertSort extends Sort {
    public static void insertSort(int[] arr, SortType sortType){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (sortType.getType()==1){
                    if(arr[j+1]<arr[j]) swap(arr,j,j+1);
                }else {
                    if(arr[j+1]>arr[j]) swap(arr,j,j+1);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a=getIntArray(10,10);
        printArrary(a);
        insertSort(a,SortType.DESC);
        printArrary(a);

    }
}
