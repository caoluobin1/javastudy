package org.clb.LeetCode.code1_10;

public class Code_2446 {

    public static boolean haveConflict(String[] event1, String[] event2) {
        String start1=event1[0];
        String start2=event2[0];
        String end1=event1[1];
        String end2=event2[1];

        return (start2.compareTo(start1)<=0&&end2.compareTo(start1)>=0)||(start1.compareTo(start2)<=0&&end1.compareTo(start2)>=0);
    }

    public static void main(String[] args) {
        String[] event1 = {"14:13","22:08"};
        String[] event2 = {"02:40","08:08"};
        System.out.println(haveConflict(event1,event2));
    }
    public boolean getR(int a,int b,int c,int d) {
        return (a<=c&&b>=d)||(a>=b&&b<=d);

    }
}
