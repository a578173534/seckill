package com.kxf.seckill.utils;

import java.util.UUID;


/**
 * UUID工具类用于生成session
 */
public class UUIDUtil {
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
