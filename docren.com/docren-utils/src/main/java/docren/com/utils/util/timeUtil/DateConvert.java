package docren.com.utils.util.timeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by lishaoyong on 17/5/9.
 */
public class DateConvert {

    /**
     * 字符串转换成日期 yyyy-MM-dd
     *
     * @param str
     * @return date
     */
    public static Date StrToDate(String str) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 获取当前日期的零点date
     *
     * @param date
     * @return date
     */
    public static Date StartOfDate(Date date)
    {
        String shortFormat = "yyyy-MM-dd 00:00:00";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        SimpleDateFormat sdf = new SimpleDateFormat(shortFormat);

        String startOfDate = sdf.format(date);

        Date d = DateConvert.StrToDate(startOfDate);
        return d;
    }

    /**
     * 获取当前日期的最后一秒日期date 23:59:59
     *
     * @param date
     * @return date
     */
    public static Date EndOfDate(Date date)
    {
        String fullFormat = "yyyy-MM-dd 23:59:59";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        SimpleDateFormat sdf = new SimpleDateFormat(fullFormat);

        String strOfDate = sdf.format(date);

        Date d = DateConvert.StrToDate(strOfDate);
        return d;
    }



}
