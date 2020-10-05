package com.example.entity;

import java.io.Serializable;

/**
 * 租赁合同明细(LeaseContractDetail)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class LeaseContractDetail implements Serializable {
    private static final long serialVersionUID = 899574629610766579L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 租赁合同ID
    */
    private Integer leaseId;
    /**
    * 工作内容材料ID
    */
    private Integer materialId;
    /**
    * 数量
    */
    private Integer count;
    /**
    * 单价
    */
    private Double price;
    /**
    * 计划进程日期
    */
    private Object planStartDate;
    /**
    * 计划退场日期
    */
    private Object planEndDate;
    /**
    * 租赁天数
    */
    private Integer leaseDays;
    /**
    * 小计
    */
    private Double sumAmount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(Integer leaseId) {
        this.leaseId = leaseId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Object getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Object planStartDate) {
        this.planStartDate = planStartDate;
    }

    public Object getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Object planEndDate) {
        this.planEndDate = planEndDate;
    }

    public Integer getLeaseDays() {
        return leaseDays;
    }

    public void setLeaseDays(Integer leaseDays) {
        this.leaseDays = leaseDays;
    }

    public Double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
    }

}