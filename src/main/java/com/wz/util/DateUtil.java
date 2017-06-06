package com.wz.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zheng on 2017/6/4.
 */
public class DateUtil {
    public static String getNowDate(Date date){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }
}
