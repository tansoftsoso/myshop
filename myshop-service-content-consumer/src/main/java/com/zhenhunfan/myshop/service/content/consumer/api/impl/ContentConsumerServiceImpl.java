package com.zhenhunfan.myshop.service.content.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhenhunfan.myshop.service.content.api.ContentConsumerService;

/**
 * <p>Title: ContentConsumerServiceImpl</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/24
 */
@Service(version = "${services.versions.content.v1}")
public class ContentConsumerServiceImpl implements ContentConsumerService {
    @Override
    public void info() {

    }
}
