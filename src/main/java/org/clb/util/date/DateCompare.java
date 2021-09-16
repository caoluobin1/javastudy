package org.clb.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Classname DateCompare
 * @Date 2021/7/19 9:46
 * @Author clb
 */
public class DateCompare {
    /**
     *
     * @param workTime ÉÏ°àÊ±¼ä
     * @return
     */
    public static boolean compare(String workTime,String quitTime) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(new Date());
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date workDateTime = formatTime.parse(date+" "+workTime);
        Date quitDateTime = formatTime.parse(date+" "+quitTime);

        Date now=new Date();
        return now.compareTo(workDateTime)>0&&now.compareTo(quitDateTime)<0;
    }
}
