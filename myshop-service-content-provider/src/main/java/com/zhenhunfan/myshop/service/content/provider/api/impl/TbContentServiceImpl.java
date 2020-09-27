package com.zhenhunfan.myshop.service.content.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhenhunfan.myshop.commons.domain.TbContent;
import com.zhenhunfan.myshop.commons.mapper.TbContentMapper;
import com.zhenhunfan.myshop.service.content.api.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * <p>Title: TbContentServiceImpl</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/23
 */
@Service(version = "${services.versions.content.v1}")
@Transactional(readOnly = true)
public class TbContentServiceImpl implements TbContentService {
    @Autowired
    private TbContentMapper tbContentMapper;

    @Override
    public PageInfo<TbContent> page(int start, int length, TbContent tbContent) {
        PageHelper.offsetPage(start, length);
        PageInfo<TbContent> pageInfo = new PageInfo<>(tbContentMapper.select(tbContent));
        return pageInfo;
    }
}
