package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 分包招标明细(SubTenderDetail)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class SubTenderDetail implements Serializable {
    private static final long serialVersionUID = -97644480306817497L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 分包招标ID
    */
    private Integer subtenderId;
    /**
    * 分包项目
    */
    private String mateId;
    /**
    * 分包工作内容
    */
    private String buyCount;
    /**
    * 计划招标时间
    */
    private Date tenderDate;
    /**
    * 组织招标方
    */
    private String tenderer;
    /**
    * 分包方式
    */
    private String subTenderType;
    /**
    * 分包商选择方式
    */
    private String subProviderChoose;
    /**
    * 候选分包商名单
    */
    private String subProviders;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubtenderId() {
        return subtenderId;
    }

    public void setSubtenderId(Integer subtenderId) {
        this.subtenderId = subtenderId;
    }

    public String getMateId() {
        return mateId;
    }

    public void setMateId(String mateId) {
        this.mateId = mateId;
    }

    public String getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(String buyCount) {
        this.buyCount = buyCount;
    }

    public Date getTenderDate() {
        return tenderDate;
    }

    public void setTenderDate(Date tenderDate) {
        this.tenderDate = tenderDate;
    }

    public String getTenderer() {
        return tenderer;
    }

    public void setTenderer(String tenderer) {
        this.tenderer = tenderer;
    }

    public String getSubTenderType() {
        return subTenderType;
    }

    public void setSubTenderType(String subTenderType) {
        this.subTenderType = subTenderType;
    }

    public String getSubProviderChoose() {
        return subProviderChoose;
    }

    public void setSubProviderChoose(String subProviderChoose) {
        this.subProviderChoose = subProviderChoose;
    }

    public String getSubProviders() {
        return subProviders;
    }

    public void setSubProviders(String subProviders) {
        this.subProviders = subProviders;
    }

}