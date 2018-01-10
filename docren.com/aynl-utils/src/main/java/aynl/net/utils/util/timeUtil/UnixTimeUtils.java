package aynl.net.utils.util.timeUtil;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class UnixTimeUtils {

    private UnixTimeUtils() {
    }

    public static int getUnixTimestamp(Date date) {
        return (int) (date.getTime() / 1000L);
    }

    public static Date fromUnixTimestamp(long unixTimestamp) {
        return new Date(unixTimestamp * 1000L);
    }

    /**
     * 当前时间unix
     * get now system time  of Unix timestamp format
     *
     * @return
     */
    public static int now() {
        return getUnixTimestamp(new Date());
    }

    /**
     * 获取当天时间 如果为凌晨则是 00:00:00
     *
     * @return unix时间
     */
    public static int getToday() {
        Date dNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dNow);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String defaultEndDate = sdf.format(dNow);

        Date today = DateConvert.StrToDate(defaultEndDate);
        return UnixTimeUtils.getUnixTimestamp(today);

    }


    /**
     * 获取当天开始或结束时间 true 开始 flase 结束
     *
     * @return unix时间
     */
    public static Date getTodayDate(Boolean status) {
        Date dNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dNow);

        String forMat = "yyyy-MM-dd 00:00:00";

        if (!status) {
            forMat = "yyyy-MM-dd 23:59:59";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(forMat);

        String defaultEndDate = sdf.format(dNow);

        Date today = DateConvert.StrToDate(defaultEndDate);
        return today;
    }

    public static int getIntTodayDate(Boolean status) {
        Date dNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dNow);

        String forMat = "yyyy-MM-dd 00:00:00";

        if (!status) {
            forMat = "yyyy-MM-dd 23:59:59";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(forMat);

        String defaultEndDate = sdf.format(dNow);

        Date today = DateConvert.StrToDate(defaultEndDate);
        return UnixTimeUtils.getUnixTimestamp(today);
    }

    /**
     * 获取昨天开始与结束时间 00:00:00 true 开始 flase 结束
     *
     * @return unix时间
     */
    public static int getYesterdayDate(Boolean status) {
        Date dNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dNow);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        Date dBefore = calendar.getTime();

        String forMat = "yyyy-MM-dd 00:00:00";

        if (!status) {
            forMat = "yyyy-MM-dd 23:59:59";
        }

        SimpleDateFormat sdf = new SimpleDateFormat(forMat);
        String defaultStartDate = sdf.format(dBefore);

        Date beforDay = DateConvert.StrToDate(defaultStartDate);
        return UnixTimeUtils.getUnixTimestamp(beforDay);
    }

    /**
     * 功能：unixtime 转换为标准时间
     *
     * @param timestampString
     * @return
     */
    public static String getTimeStamp2Date(long timestampString) {
        Long timestamp = timestampString * 1000L;
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timestamp));
        return date;
    }

    /**
     * date >> string
     * yyyy-MM-dd HH:mm:ss
     * yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static String getDateToStrForMat(Date date, String forMat) {
        String dateStr = "";

        //format的格式可以任意

        DateFormat sdf = new SimpleDateFormat(forMat);
        try {
            dateStr = sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }

    /**
     * string to date
     *
     * @param strDate yyyy-MM-dd HH:mm:ss  yyyy-MM-dd
     * @return
     * @throws ParseException
     */
    public static Date getStrToDateForMat(String strDate, String forMat) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(forMat);
        Date date = sdf.parse(strDate);
        return date;
    }


    public static int getIntTime(String date) {

        int time = 0;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1 = sdf.parse(date);
            String strTime = d1.getTime() + "";
            strTime = strTime.substring(0, 10);
            time = Integer.parseInt(strTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    public static long getUnixTime(String useDate) {
        String re_time = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d;
        try {
            d = sdf.parse(useDate);
            long l = d.getTime();
            String str = String.valueOf(l);
            re_time = str.substring(0, 10);


        } catch (ParseException e) {
            e.printStackTrace();
        }
        return Long.parseLong(re_time);
    }

    public static void main(String args[]){
        int starTime = UnixTimeUtils.getIntTodayDate(true) - 86400;
        int endTime = UnixTimeUtils.getIntTodayDate(false) - 86400 ;
        System.out.println(UnixTimeUtils.getTimeStamp2Date(starTime));
        System.out.println(UnixTimeUtils.getTimeStamp2Date(endTime));
    }
}
