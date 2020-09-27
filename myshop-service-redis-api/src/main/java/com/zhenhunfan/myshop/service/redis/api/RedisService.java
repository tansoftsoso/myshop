package com.zhenhunfan.myshop.service.redis.api;

/**
 * <p>Title: RedisService</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/24
 */
public interface RedisService {
    void set(String key, Object value);

    void set(String key, Object value, int seconds);

    void del(String key);

    Object get(String key);
}
