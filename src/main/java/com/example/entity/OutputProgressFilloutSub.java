package com.example.entity;

import java.io.Serializable;

/**
 * 产值进度填报子表(OutputProgressFilloutSub)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public class OutputProgressFilloutSub implements Serializable {
    private static final long serialVersionUID = -53205715501793396L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 进度填报ID
    */
    private Integer filloutId;
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
    * 完工量
    */
    private Integer finishTaskCount;
    /**
    * 小计
    */
    private Double totalPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFilloutId() {
        return filloutId;
    }

    public void setFilloutId(Integer filloutId) {
        this.filloutId = filloutId;
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

    public Integer getFinishTaskCount() {
        return finishTaskCount;
    }

    public void setFinishTaskCount(Integer finishTaskCount) {
        this.finishTaskCount = finishTaskCount;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

}