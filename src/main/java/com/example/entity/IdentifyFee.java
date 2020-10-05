package com.example.entity;

import java.io.Serializable;

/**
 * 证件费用表(IdentifyFee)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class IdentifyFee implements Serializable {
    private static final long serialVersionUID = -63911550308428122L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 性别
    */
    private String sex;
    /**
    * 证件名称
    */
    private String credentialName;
    /**
    * 证书编号
    */
    private String credentialNo;
    /**
    * 开始日期
    */
    private Object startDate;
    /**
    * 结束日期
    */
    private Object endDate;
    /**
    * 证件费用
    */
    private Double credentialFee;
    /**
    * 费用大写
    */
    private String feeUpper;
    /**
    * 附件
    */
    private String attachIds;
    /**
    * 备注
    */
    private String pictureIds;
    /**
    * 更新日期
    */
    private Object updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCredentialName() {
        return credentialName;
    }

    public void setCredentialName(String credentialName) {
        this.credentialName = credentialName;
    }

    public String getCredentialNo() {
        return credentialNo;
    }

    public void setCredentialNo(String credentialNo) {
        this.credentialNo = credentialNo;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Double getCredentialFee() {
        return credentialFee;
    }

    public void setCredentialFee(Double credentialFee) {
        this.credentialFee = credentialFee;
    }

    public String getFeeUpper() {
        return feeUpper;
    }

    public void setFeeUpper(String feeUpper) {
        this.feeUpper = feeUpper;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

    public String getPictureIds() {
        return pictureIds;
    }

    public void setPictureIds(String pictureIds) {
        this.pictureIds = pictureIds;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

}