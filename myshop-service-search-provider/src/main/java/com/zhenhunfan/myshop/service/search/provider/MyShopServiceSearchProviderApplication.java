package com.zhenhunfan.myshop.service.search.provider;

import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>Title: MyShopServiceSearchProviderApplication</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/27
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.zhenhunfan.myshop")
@MapperScan(basePackages = "com.zhenhunfan.myshop.service.search.provider.mapper")
public class MyShopServiceSearchProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceSearchProviderApplication.class, args);
        Main.main(args);
    }
}