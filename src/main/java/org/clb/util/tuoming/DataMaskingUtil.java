package org.clb.util.tuoming;

/**
 * @Description
 * @Classname DataMaskingUtil
 * @Date 2021/6/19 10:50
 * @Author clb
 */
public class DataMaskingUtil {

    public static String dataMasking(String data,DataType dataType){
        StringBuilder sb=new StringBuilder(data);
        StringBuilder replace=new StringBuilder();
        for (int length = 0; length < dataType.end - dataType.start; length++) {
            replace.append("*");
        }
        sb.replace(dataType.start,dataType.end,replace.toString());


        return sb.toString();
    }

    public static String  a(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder replace = new StringBuilder("*");
        for (int length = 0; length < s.length()-4; length++) {
            replace.append("*");
        }
        sb.replace(4, s.length(), replace.toString());
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(a("235698746"));
    }
    enum DataType{
        IDCARD("IDCARD",1,1),
        NAME("NAME",1,2)
        ;
        String type;
        Integer start;
        Integer end;

        DataType(String type, Integer start, Integer end) {
            this.type = type;
            this.start = start;
            this.end = end;
        }
    }
}
