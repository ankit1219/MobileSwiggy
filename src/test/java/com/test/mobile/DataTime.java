package com.test.mobile;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DataTime {
    public String getcurrentTime() {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        SimpleDateFormat dateformate = new SimpleDateFormat("ddMMyyyy_hhmmss");
        System.out.println(dateformate.format(timestamp));

        return dateformate.format(timestamp);

    }

    public static void main(String[] args) {
    	DataTime printTime = new DataTime();
        String time = printTime.getcurrentTime();
        System.out.println(time);

    }

}