package com.lizza;

import redis.clients.jedis.Jedis;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2022-01-24
 */
public class JedisHolder {

    public static Jedis jedis() {
        Jedis jedis = new Jedis("192.168.151.140", 6379);
        return jedis;
    }
}
