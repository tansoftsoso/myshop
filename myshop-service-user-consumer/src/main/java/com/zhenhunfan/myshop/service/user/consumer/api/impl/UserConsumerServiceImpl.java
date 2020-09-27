package com.zhenhunfan.myshop.service.user.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhenhunfan.myshop.service.user.api.UserConsumerService;

/**
 * <p>Title: UserConsumerServiceImpl</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/23
 */
@Service(version = "${services.versions.user.v1}")
public class UserConsumerServiceImpl implements UserConsumerService {
    @Override
    public void info() {

    }
}
