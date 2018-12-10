package com.rabbit.util;

import java.util.UUID;

public class Util {
    public String uuid(){

        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }

    public static void main(String[] args) {
        Util util = new Util();
        System.out.println(util.uuid());
    }
}
