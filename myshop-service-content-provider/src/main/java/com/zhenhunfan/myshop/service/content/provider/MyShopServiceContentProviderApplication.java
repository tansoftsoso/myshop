package com.zhenhunfan.myshop.service.content.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>Title: MyShopServiceContentProviderApplication</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/23
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.zhenhunfan.myshop")
@EnableTransactionManagement
@MapperScan(basePackages = "com.zhenhunfan.myshop.commons.mapper")
public class MyShopServiceContentProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceContentProviderApplication.class, args);
        Main.main(args);
    }
}
