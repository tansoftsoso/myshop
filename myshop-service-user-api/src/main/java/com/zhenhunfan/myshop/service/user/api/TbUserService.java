package com.zhenhunfan.myshop.service.user.api;

import com.github.pagehelper.PageInfo;
import com.zhenhunfan.myshop.commons.domain.TbUser;

import java.util.List;

/**
 * <p>Title: TbUserService</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/21
 */
public interface TbUserService {
    /**
     * 查询全部数据
     * @return
     */
    List<TbUser> selectAll();

    /**
     * 查询分页数据
     * @param pageNum 页码
     * @param pageSize 笔数
     * @param tbUser 查询参数
     * @return
     */
    PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser);
}
