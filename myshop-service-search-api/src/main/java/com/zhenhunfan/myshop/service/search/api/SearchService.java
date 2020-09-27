package com.zhenhunfan.myshop.service.search.api;

import com.zhenhunfan.myshop.service.search.domain.TbItemResult;

import java.util.List;

/**
 * <p>Title: SearchService</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/27
 */
public interface SearchService {
    List<TbItemResult> search(String query, int page, int rows);
}