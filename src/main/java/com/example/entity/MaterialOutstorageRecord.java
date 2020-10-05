package com.example.entity;

import java.io.Serializable;

/**
 * 材料出库记录(MaterialOutstorageRecord)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class MaterialOutstorageRecord implements Serializable {
    private static final long serialVersionUID = 227835243957783177L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer proId;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 出库名称
    */
    private String outstorageName;
    /**
    * 出库合计金额
    */
    private Double instorageAmount;
    /**
    * 金额大写
    */
    private String amountUpper;
    /**
    * 填报人
    */
    private String applyer;
    /**
    * 填报日期
    */
    private Object date;
    /**
    * 领用人
    */
    private Integer getUser;
    /**
    * 领用班组ID
    */
    private Integer getOrgId;
    /**
    * 出库人
    */
    private Integer outstorageId;
    /**
    * 出库原因
    */
    private String outstorageReason;
    /**
    * 备注
    */
    private String comment;
    /**
    * 审批状态
    */
    private Integer approveStatus;
    /**
    * 附件
    */
    private String attachIds;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getOutstorageName() {
        return outstorageName;
    }

    public void setOutstorageName(String outstorageName) {
        this.outstorageName = outstorageName;
    }

    public Double getInstorageAmount() {
        return instorageAmount;
    }

    public void setInstorageAmount(Double instorageAmount) {
        this.instorageAmount = instorageAmount;
    }

    public String getAmountUpper() {
        return amountUpper;
    }

    public void setAmountUpper(String amountUpper) {
        this.amountUpper = amountUpper;
    }

    public String getApplyer() {
        return applyer;
    }

    public void setApplyer(String applyer) {
        this.applyer = applyer;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Integer getGetUser() {
        return getUser;
    }

    public void setGetUser(Integer getUser) {
        this.getUser = getUser;
    }

    public Integer getGetOrgId() {
        return getOrgId;
    }

    public void setGetOrgId(Integer getOrgId) {
        this.getOrgId = getOrgId;
    }

    public Integer getOutstorageId() {
        return outstorageId;
    }

    public void setOutstorageId(Integer outstorageId) {
        this.outstorageId = outstorageId;
    }

    public String getOutstorageReason() {
        return outstorageReason;
    }

    public void setOutstorageReason(String outstorageReason) {
        this.outstorageReason = outstorageReason;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

}