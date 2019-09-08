package cn.txx.ch9_1;

import org.junit.Test;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;

import java.util.Set;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/9/8
 */
public class RedisTest {
    @Test
    public void redisTest(){
        //Jedis jedis = new Jedis("47.102.157.88",6379);
        Jedis jedis = new Jedis("192.168.1.115",6379);
        jedis.append("name","txx");
        Set<String> keys = jedis.keys("*");
        keys.forEach(s -> {
            System.out.println(s);
        });
    }
}
