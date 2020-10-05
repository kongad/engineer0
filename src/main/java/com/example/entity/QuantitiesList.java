package com.example.entity;

import java.io.Serializable;

/**
 * 工程量清单(QuantitiesList)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class QuantitiesList implements Serializable {
    private static final long serialVersionUID = -62973002488581261L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 清单子目
    */
    private String subList;
    /**
    * 单位
    */
    private String unit;
    /**
    * 工程量
    */
    private Integer workCount;
    /**
    * 综合单价
    */
    private Double comprePrice;
    /**
    * 合价
    */
    private Double sumPrice;
    /**
    * 备注
    */
    private String comment;


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

    public String getSubList() {
        return subList;
    }

    public void setSubList(String subList) {
        this.subList = subList;
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

    public Double getComprePrice() {
        return comprePrice;
    }

    public void setComprePrice(Double comprePrice) {
        this.comprePrice = comprePrice;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}