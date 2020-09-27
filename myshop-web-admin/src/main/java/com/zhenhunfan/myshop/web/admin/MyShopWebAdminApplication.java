package com.zhenhunfan.myshop.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>Title: MyShopWebAdminApplication</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/24
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.zhenhunfan.myshop", exclude = DataSourceAutoConfiguration.class)
public class MyShopWebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopWebAdminApplication.class, args);
    }
}
