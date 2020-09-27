package com.zhenhunfan.myshop.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>Title: MyShopApiGatewayApplication</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/23
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.zhenhunfan.myshop", exclude = DataSourceAutoConfiguration.class)
public class MyShopApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopApiGatewayApplication.class, args);
    }
}
