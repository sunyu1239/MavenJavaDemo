package day0529;

import redis.clients.jedis.Jedis;

public class ReidsDemo {
    public static void main(String[] args) {
        Jedis jde = new Jedis("127.0.0.1", 6379);
        String ss = jde.get("mykey");
        jde.close();
        System.out.println(ss);
    }
}
