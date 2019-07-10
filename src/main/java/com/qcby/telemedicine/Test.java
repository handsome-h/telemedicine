package com.qcby.telemedicine;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Author handsome-h
 * @ Date 2019/7/9 14:52
 * @ Description
 **/
public class Test {
    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
        java.sql.Date data1=new java.sql.Date(date.getTime());
        System.out.println(data1);
    }
}
