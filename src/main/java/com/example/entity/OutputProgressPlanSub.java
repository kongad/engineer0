package com.example.entity;

import java.io.Serializable;

/**
 * 产值进度计划子表(OutputProgressPlanSub)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class OutputProgressPlanSub implements Serializable {
    private static final long serialVersionUID = -76289594140369432L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 产值计划ID
    */
    private Integer outputId;
    /**
    * 清单子目
    */
    private String listSubject;
    /**
    * 单位
    */
    private String unit;
    /**
    * 工程量
    */
    private Integer tasksCount;
    /**
    * 综合单价
    */
    private Double generalPrice;
    /**
    * 合计
    */
    private Double sumAmount;
    /**
    * 编制人
    */
    private String editerId;
    /**
    * 计划日期
    */
    private Object planDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOutputId() {
        return outputId;
    }

    public void setOutputId(Integer outputId) {
        this.outputId = outputId;
    }

    public String getListSubject() {
        return listSubject;
    }

    public void setListSubject(String listSubject) {
        this.listSubject = listSubject;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getTasksCount() {
        return tasksCount;
    }

    public void setTasksCount(Integer tasksCount) {
        this.tasksCount = tasksCount;
    }

    public Double getGeneralPrice() {
        return generalPrice;
    }

    public void setGeneralPrice(Double generalPrice) {
        this.generalPrice = generalPrice;
    }

    public Double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
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

}