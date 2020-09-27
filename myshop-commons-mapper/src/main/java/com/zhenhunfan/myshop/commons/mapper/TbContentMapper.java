package com.zhenhunfan.myshop.commons.mapper;

import com.zhenhunfan.myshop.commons.domain.TbContent;
import com.zhenhunfan.myshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbContentMapper extends MyMapper<TbContent> {
}