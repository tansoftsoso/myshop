package com.zhenhunfan.myshop.service.redis.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>Title: MyShopServiceRedisProviderApplication</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/24
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class MyShopServiceRedisProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceRedisProviderApplication.class, args);
        Main.main(args);
    }
}
