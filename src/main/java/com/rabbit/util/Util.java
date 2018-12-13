package com.rabbit.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Util {
    /**
     * UUID
     * @return
     */
    public static String uuid() {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String getTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }

    public static void main(String[] args) {
        Util util = new Util();
        System.out.println(util.uuid());
    }
}
