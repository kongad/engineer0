package com.example.entity;

import java.io.Serializable;

/**
 * 产值进度计划主表(OutputProgressPlan)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class OutputProgressPlan implements Serializable {
    private static final long serialVersionUID = 426779246569328989L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 计划主题
    */
    private String planSubject;
    /**
    * 编制人
    */
    private String editerId;
    /**
    * 计划日期
    */
    private Object planDate;
    /**
    * 合计
    */
    private Double totalAmount;
    /**
    * 合计大写
    */
    private Double totalUpper;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPlanSubject() {
        return planSubject;
    }

    public void setPlanSubject(String planSubject) {
        this.planSubject = planSubject;
    }

    public String getEditerId() {
        return editerId;
    }

    public void setEditerId(String editerId) {
        this.editerId = editerId;
    }

    public Object getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Object planDate) {
        this.planDate = planDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalUpper() {
        return totalUpper;
    }

    public void setTotalUpper(Double totalUpper) {
        this.totalUpper = totalUpper;
    }

}