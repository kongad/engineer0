package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 招标采购明细(TenderPurchaseDetail)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class TenderPurchaseDetail implements Serializable {
    private static final long serialVersionUID = -62182136832409740L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 采购计划ID
    */
    private Integer planId;
    /**
    * 物资ID
    */
    private Integer mateId;
    /**
    * 估算数量
    */
    private Double buyCount;
    /**
    * 物资采购单位
    */
    private String useDept;
    /**
    * 采购时间
    */
    private Date buyTime;
    /**
    * 采购地点
    */
    private String buyAddress;
    /**
    * 候选供应商名单
    */
    private String providerName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getMateId() {
        return mateId;
    }

    public void setMateId(Integer mateId) {
        this.mateId = mateId;
    }

    public Double getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Double buyCount) {
        this.buyCount = buyCount;
    }

    public String getUseDept() {
        return useDept;
    }

    public void setUseDept(String useDept) {
        this.useDept = useDept;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getBuyAddress() {
        return buyAddress;
    }

    public void setBuyAddress(String buyAddress) {
        this.buyAddress = buyAddress;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

}