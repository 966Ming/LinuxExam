package com.atguigu.jdbc.test;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("123.60.159.86",6379);
        System.out.println(jedis.ping());
    }
}
