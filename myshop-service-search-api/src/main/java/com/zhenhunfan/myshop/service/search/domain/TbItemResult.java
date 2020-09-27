package com.zhenhunfan.myshop.service.search.domain;

import java.io.Serializable;

/**
 * <p>Title: TbItemResult</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2020/9/27
 */
public class TbItemResult implements Serializable {
    private long id;
    private long tbItemCid;
    private String tbItemCname;
    private String tbItemTitle;
    private String tbItemSellPoint;
    private String tbItemDesc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTbItemCid() {
        return tbItemCid;
    }

    public void setTbItemCid(long tbItemCid) {
        this.tbItemCid = tbItemCid;
    }

    public String getTbItemCname() {
        return tbItemCname;
    }

    public void setTbItemCname(String tbItemCname) {
        this.tbItemCname = tbItemCname;
    }

    public String getTbItemTitle() {
        return tbItemTitle;
    }

    public void setTbItemTitle(String tbItemTitle) {
        this.tbItemTitle = tbItemTitle;
    }

    public String getTbItemSellPoint() {
        return tbItemSellPoint;
    }

    public void setTbItemSellPoint(String tbItemSellPoint) {
        this.tbItemSellPoint = tbItemSellPoint;
    }

    public String getTbItemDesc() {
        return tbItemDesc;
    }

    public void setTbItemDesc(String tbItemDesc) {
        this.tbItemDesc = tbItemDesc;
    }
}
