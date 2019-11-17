package com.test.test8;

import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class Test {
    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();
        objects.add(null);
        objects.add(null);
        objects.add("");
        objects.add("");
        System.out.println(objects.size());


        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
       String str=format.substring(format.indexOf("")+1,format.length());
        System.out.println(str);
        System.out.println(">>>>>>>>>>>>>>>>");
        int localTime =  LocalTime.now().getNano();
        System.out.println(localTime);
//        List change = UserTest.change();
//        System.out.println(change.toString());
//        System.out.println(">>>>>>>>>>>>>>>");
//        System.out.println(JSON.toJSONString(change));
    }
}
