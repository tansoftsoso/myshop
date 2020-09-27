package com.zhenhunfan.myshop.service.user.consumer;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p>Title: MyShopServiceUserConsumerApplication</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/21
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.zhenhunfan.myshop",exclude = DataSourceAutoConfiguration.class)
public class MyShopServiceUserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceUserConsumerApplication.class, args);
        Main.main(args);
    }
}
