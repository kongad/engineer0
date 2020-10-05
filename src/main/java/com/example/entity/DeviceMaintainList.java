package com.example.entity;

import java.io.Serializable;

/**
 * 设备维保明细(DeviceMaintainList)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class DeviceMaintainList implements Serializable {
    private static final long serialVersionUID = -12010774411129360L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 设备计划ID
    */
    private Integer dPlanId;
    /**
    * 设备材料ID
    */
    private Integer materialId;
    /**
    * 维保内容
    */
    private String maintainContent;
    /**
    * 工时数
    */
    private Integer workHour;
    /**
    * 人工合价
    */
    private Double laborFee;
    /**
    * 材料合价
    */
    private Double materialFee;
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

    public Integer getDPlanId() {
        return dPlanId;
    }

    public void setDPlanId(Integer dPlanId) {
        this.dPlanId = dPlanId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getMaintainContent() {
        return maintainContent;
    }

    public void setMaintainContent(String maintainContent) {
        this.maintainContent = maintainContent;
    }

    public Integer getWorkHour() {
        return workHour;
    }

    public void setWorkHour(Integer workHour) {
        this.workHour = workHour;
    }

    public Double getLaborFee() {
        return laborFee;
    }

    public void setLaborFee(Double laborFee) {
        this.laborFee = laborFee;
    }

    public Double getMaterialFee() {
        return materialFee;
    }

    public void setMaterialFee(Double materialFee) {
        this.materialFee = materialFee;
    }

    public Double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
    }

}