package aynl.net.utils;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by lishaoyong
 */
public class RedixUtil {

    private static String host = "127.0.0.1";
    private static int port = 6379;
    private static String instanceAndPwd = "password";

    public static String getString(String key) {
        Jedis redis = null;
        try {
            redis = new Jedis(host, port);//连接redis
            redis.auth(instanceAndPwd);//验证密码
            return redis.get(key);
        } finally {
            if (redis != null) {
                redis.quit();
                redis.close();
            }
        }
    }

    public static void setString(String key, String value) {
        Jedis redis = null;
        try {
            redis = new Jedis(host, port);//连接redis
            redis.auth(instanceAndPwd);//验证密码
            redis.set(key, value);
        } finally {
            redis.quit();
            redis.close();
        }
    }

    public static void setString(String key, String value, int seconds) {
        Jedis redis = null;
        try {
            redis = new Jedis(host, port);//连接redis
            redis.auth(instanceAndPwd);//验证密码
            redis.set(key, value);
            redis.expire(key, seconds);
        } finally {
            redis.quit();
            redis.close();
        }
    }

    public static boolean exits(String key) {
        Jedis redis = null;
        try {
            redis = new Jedis(host, port);//连接redis
            redis.auth(instanceAndPwd);//验证密码
            return redis.exists(key);
        } finally {
            redis.quit();
            redis.close();
        }
    }


    public static void main(String[] args) {
        Jedis redis = new Jedis(host, port);//连接redis
        redis.auth("password");//验证密码

        //KEYS
        Set keys = redis.keys("*");//列出所有的key，查找特定的key如：redis.keys("foo")
        Iterator t1 = keys.iterator();
        while (t1.hasNext()) {
            Object obj1 = t1.next();
            System.out.println(obj1);
        }


        redis.quit();
        redis.close();
    }}

