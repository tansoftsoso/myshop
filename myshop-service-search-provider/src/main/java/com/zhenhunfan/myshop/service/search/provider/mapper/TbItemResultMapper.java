package com.zhenhunfan.myshop.service.search.provider.mapper;

import com.zhenhunfan.myshop.service.search.domain.TbItemResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>Title: TbItemResultMapper</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/27
 */
@Repository
public interface TbItemResultMapper {
    List<TbItemResult> selectAll();
}
