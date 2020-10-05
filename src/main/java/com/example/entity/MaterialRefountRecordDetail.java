package com.example.entity;

import java.io.Serializable;

/**
 * 材料退库记录明细(MaterialRefountRecordDetail)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class MaterialRefountRecordDetail implements Serializable {
    private static final long serialVersionUID = -17693542766348251L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 出库记录ID
    */
    private Integer instorageId;
    /**
    * 物资ID
    */
    private Integer mateId;
    /**
    * 退库数量
    */
    private Integer refoundCount;
    /**
    * 单价
    */
    private Double price;
    /**
    * 小计金额
    */
    private Double sumAmount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstorageId() {
        return instorageId;
    }

    public void setInstorageId(Integer instorageId) {
        this.instorageId = instorageId;
    }

    public Integer getMateId() {
        return mateId;
    }

    public void setMateId(Integer mateId) {
        this.mateId = mateId;
    }

    public Integer getRefoundCount() {
        return refoundCount;
    }

    public void setRefoundCount(Integer refoundCount) {
        this.refoundCount = refoundCount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
    }

}