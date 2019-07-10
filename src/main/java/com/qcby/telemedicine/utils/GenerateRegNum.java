package com.qcby.telemedicine.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Author handsome-h
 * @ Date 2019/7/9 14:57
 * @ Description 生成挂号单号
 **/
public class GenerateRegNum {
    public static String generate(){
        String mark = "";
        for (int i = 0; i < 4; i++) {
            int random = (int) (Math.random() * 10);
            mark = mark + random;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String timeStamp = simpleDateFormat.format(new Date());
        String newmark=timeStamp + mark;
        return newmark;
    }
}
