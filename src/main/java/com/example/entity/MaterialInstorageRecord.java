package com.example.entity;

import java.io.Serializable;

/**
 * 材料入库记录(MaterialInstorageRecord)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:37
 */
public class MaterialInstorageRecord implements Serializable {
    private static final long serialVersionUID = -38613522369834465L;
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
    * 入库名称
    */
    private String instorageName;
    /**
    * 供应商
    */
    private Integer providerId;
    /**
    * 入库金额
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
    * 采购员
    */
    private Integer buyerId;
    /**
    * 交货人
    */
    private String deliveryPerson;
    /**
    * 验收人
    */
    private Integer acceptorId;
    /**
    * 入库人
    */
    private Integer instorageId;
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

    public String getInstorageName() {
        return instorageName;
    }

    public void setInstorageName(String instorageName) {
        this.instorageName = instorageName;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
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

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public Integer getAcceptorId() {
        return acceptorId;
    }

    public void setAcceptorId(Integer acceptorId) {
        this.acceptorId = acceptorId;
    }

    public Integer getInstorageId() {
        return instorageId;
    }

    public void setInstorageId(Integer instorageId) {
        this.instorageId = instorageId;
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