package com.zhenhunfan.myshop.service.content.api;

import com.github.pagehelper.PageInfo;
import com.zhenhunfan.myshop.commons.domain.TbContent;

import java.util.List;

/**
 * <p>Title: TbContentService</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/23
 */
public interface TbContentService {
    /**
     * 分页查询
     * @param start
     * @param length
     * @param tbContent
     * @return
     */
    PageInfo<TbContent> page(int start, int length, TbContent tbContent);
}
