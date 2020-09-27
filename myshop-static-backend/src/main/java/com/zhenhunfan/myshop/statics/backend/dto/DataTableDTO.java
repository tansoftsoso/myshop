package com.zhenhunfan.myshop.statics.backend.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Title: DataTableDTO</p>
 * <p>Description: Bootstrap DataTable 数据传输对象</p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/23
 */
@Data
public class DataTableDTO<T> implements Serializable {
    private int draw;
    private long recordsTotal;
    private long recordsFiltered;
    private List<T> data;
    private String error;

}
