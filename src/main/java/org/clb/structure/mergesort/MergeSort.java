package org.clb.structure.mergesort;

/**
 * @Description πÈ≤¢≈≈–Ú
 * @Classname MergeSort
 * @Date 2021/5/13 4:30
 * @Author clb
 */
public class MergeSort {
    public int[] mergeSort(int[] array,int l,int r){
        while (array==null||array.length<2){
            return array;
        }
        int mid=l+((r-l)>>1);
        //,
        return merge(mergeSort(array,l,mid),mergeSort(array,mid+1,l));
    }

    private int[] merge(int[] array, int[] array2) {
        return new int[0];
    }


}
