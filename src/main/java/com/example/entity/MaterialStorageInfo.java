package com.example.entity;

import java.io.Serializable;

/**
 * 材料库存表(MaterialStorageInfo)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class MaterialStorageInfo implements Serializable {
    private static final long serialVersionUID = -84529801332479816L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 物资ID
    */
    private Integer mateId;
    /**
    * 仓库ID
    */
    private Integer warehouseId;
    /**
    * 库存数量
    */
    private Integer storageCount;
    /**
    * 单价
    */
    private Double price;
    /**
    * 合计金额
    */
    private Double sumAmount;


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

    public Integer getMateId() {
        return mateId;
    }

    public void setMateId(Integer mateId) {
        this.mateId = mateId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getStorageCount() {
        return storageCount;
    }

    public void setStorageCount(Integer storageCount) {
        this.storageCount = storageCount;
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