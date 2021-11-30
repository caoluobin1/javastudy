package org.clb;


import java.text.ParseException;
import java.util.Map;

/**
 * @Description
 * @Classname Test222
 * @Date 2021/6/6 17:14
 * @Author clb
 */
public class Test222 {

    public static void main(String[] args) throws ParseException {
        String a = "man_cz_nurse_num VARCHAR(32) default 0 comment '男性持证护理员' ;" +
                "man_cz_nurse_num_yes VARCHAR(32) default 0 comment '男性持证护理员' ;" +
                "woman_cz_nurse_num VARCHAR(32) default 0 comment '女性持证护理员' ;" +
                "woman_cz_nurse_num_yes VARCHAR(32) default 0 comment '女性持证护理员' ;" +
                "cz_cz_nurse_num VARCHAR(32) default 0 comment '初中持证护理员数' ;" +
                "cz_cz_nurse_num_yes VARCHAR(32) default 0 comment '初中持证护理员数' ;" +
                "gz_cz_nurse_num VARCHAR(32) default 0 comment '高中持证护理员数' ;" +
                "gz_cz_nurse_num_yes VARCHAR(32) default 0 comment '高中持证护理员数' ;" +
                "zz_cz_nurse_num VARCHAR(32) default 0 comment '中职/中专持证护理员' ;" +
                "zz_cz_nurse_num_yes VARCHAR(32) default 0 comment '中职/中专持证护理员' ;" +
                "dz_cz_nurse_num VARCHAR(32) default 0 comment '大专持证护理员数' ;" +
                "dz_cz_nurse_num_yes VARCHAR(32) default 0 comment '大专持证护理员数' ;" +
                "bk_cz_nurse_num VARCHAR(32) default 0 comment '本科持证护理员数' ;" +
                "bk_cz_nurse_num_yes VARCHAR(32) default 0 comment '本科持证护理员数' ;" +
                "yjs_cz_nurse_num VARCHAR(32) default 0 comment '研究生持证护理员数' ;" +
                "yjs_cz_nurse_num_yes VARCHAR(32) default 0 comment '研究生持证护理员数' ;" +
                "less_thirty_cz_nurse_num VARCHAR(32) default 0 comment '30以下持证护理员数' ;" +
                "less_thirty_cz_nurse_num_yes VARCHAR(32) default 0 comment '30以下持证护理员数' ;" +
                "thirty_cz_nurse_num VARCHAR(32) default 0 comment '30-39以下持证护理员数' ;" +
                "thirty_cz_nurse_num_yes VARCHAR(32) default 0 comment '30-39以下持证护理员数' ;" +
                "forty_cz_nurse_num VARCHAR(32) default 0 comment '40-49以下持证护理员数' ;" +
                "forty_cz_nurse_num_yes VARCHAR(32) default 0 comment '40-49以下持证护理员数' ;" +
                "more_fifty_cz_nurse_num VARCHAR(32) default 0 comment '50以上持证护理员数' ;" +
                "more_fifty_cz_nurse_num_yes VARCHAR(32) default 0 comment '50以上持证护理员数' ;";
        String[] split = a.split(" VARCHAR");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                result.append(split[i] + ",");
            } else if (i < split.length - 1) {

                result.append(split[i].split(";")[1] + ",");
            }

        }
        System.out.println(result.toString());
        String[] split1 = result.toString().split(",");
        for (int i = 0; i < split1.length; i++) {
            System.out.print(split1[i] + "=?,");
        }

    }
    //        String year = datetime.substring(0,4);
    //        String month = datetime.substring(0,7);
    //        String date = datetime.substring(0,10);
    //        System.out.println(year);
    //        System.out.println(month);
    //        System.out.println(date);
    public static void a(Map<String, Object> map) {
        map.put("status", (Integer) map.get("status") + 1);
    }

}
