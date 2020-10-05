package com.example.entity;

import java.io.Serializable;

/**
 * 劳务工程量清单(LaborWorkList)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public class LaborWorkList implements Serializable {
    private static final long serialVersionUID = 224503316558555464L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 劳务ID
    */
    private Integer laborId;
    /**
    * 工作内容
    */
    private String workContent;
    /**
    * 单位
    */
    private String unit;
    /**
    * 工程量
    */
    private Integer workCount;
    /**
    * 单价
    */
    private Double unitPrice;
    /**
    * 合价
    */
    private Double sumPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLaborId() {
        return laborId;
    }

    public void setLaborId(Integer laborId) {
        this.laborId = laborId;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getWorkCount() {
        return workCount;
    }

    public void setWorkCount(Integer workCount) {
        this.workCount = workCount;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

}