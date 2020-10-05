package com.example.entity;

import java.io.Serializable;

/**
 * 材料基础库(MaterialInfo)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class MaterialInfo implements Serializable {
    private static final long serialVersionUID = -23009488032445508L;
    /**
    * 编码
    */
    private Integer id;
    /**
    * 材料名称
    */
    private String materialName;
    /**
    * 材料类型ID
    */
    private String mateTypeId;
    /**
    * 单位
    */
    private String unit;
    /**
    * 售价
    */
    private String price;
    /**
    * 规格型号
    */
    private String unitModel;
    /**
    * 颜色
    */
    private String color;
    /**
    * 品牌
    */
    private String brand;
    /**
    * 更新时间
    */
    private Object updateTime;
    /**
    * 更新人
    */
    private String updater;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMateTypeId() {
        return mateTypeId;
    }

    public void setMateTypeId(String mateTypeId) {
        this.mateTypeId = mateTypeId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnitModel() {
        return unitModel;
    }

    public void setUnitModel(String unitModel) {
        this.unitModel = unitModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

}