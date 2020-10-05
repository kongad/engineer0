package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 招标报价对比明细(TendeCompareDetail)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class TendeCompareDetail implements Serializable {
    private static final long serialVersionUID = 628313558087364875L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 招标对比ID
    */
    private Integer cId;
    /**
    * 招标内容
    */
    private String tenderContent;
    /**
    * 单位
    */
    private String unit;
    /**
    * 数量/工程量
    */
    private String workCount;
    /**
    * 招标底价
    */
    private Double basePrice;
    /**
    * 日期
    */
    private Date tenderDate;
    /**
    * 供应商1
    */
    private String provider1;
    /**
    * 价格1
    */
    private Double offerPrice1;
    /**
    * 供应商2
    */
    private String provider2;
    /**
    * 价格2
    */
    private Double offerPrice2;
    /**
    * 供应商3
    */
    private String provider3;
    /**
    * 价格3
    */
    private Double offerPrice3;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getTenderContent() {
        return tenderContent;
    }

    public void setTenderContent(String tenderContent) {
        this.tenderContent = tenderContent;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWorkCount() {
        return workCount;
    }

    public void setWorkCount(String workCount) {
        this.workCount = workCount;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Date getTenderDate() {
        return tenderDate;
    }

    public void setTenderDate(Date tenderDate) {
        this.tenderDate = tenderDate;
    }

    public String getProvider1() {
        return provider1;
    }

    public void setProvider1(String provider1) {
        this.provider1 = provider1;
    }

    public Double getOfferPrice1() {
        return offerPrice1;
    }

    public void setOfferPrice1(Double offerPrice1) {
        this.offerPrice1 = offerPrice1;
    }

    public String getProvider2() {
        return provider2;
    }

    public void setProvider2(String provider2) {
        this.provider2 = provider2;
    }

    public Double getOfferPrice2() {
        return offerPrice2;
    }

    public void setOfferPrice2(Double offerPrice2) {
        this.offerPrice2 = offerPrice2;
    }

    public String getProvider3() {
        return provider3;
    }

    public void setProvider3(String provider3) {
        this.provider3 = provider3;
    }

    public Double getOfferPrice3() {
        return offerPrice3;
    }

    public void setOfferPrice3(Double offerPrice3) {
        this.offerPrice3 = offerPrice3;
    }

}