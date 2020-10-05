package com.example.entity;

import java.io.Serializable;

/**
 * 材料付款(MaterialPayment)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class MaterialPayment implements Serializable {
    private static final long serialVersionUID = 585602179079087743L;
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
    * 付款名称
    */
    private String paymentName;
    /**
    * 单源类型
    */
    private String orderType;
    /**
    * 单源号
    */
    private String orderNumber;
    /**
    * 供应商ID
    */
    private Integer providerId;
    /**
    * 供应商银行账号
    */
    private String providerAccount;
    /**
    * 我方银行账号
    */
    private String ourBankAccount;
    /**
    * 付款金额
    */
    private Double payAmount;
    /**
    * 经办人
    */
    private Integer handlerId;
    /**
    * 填报日期
    */
    private Object fillDate;
    /**
    * 付款说明
    */
    private String payComment;
    /**
    * 审批状态
    */
    private Integer approveStatus;
    /**
    * 附件列表多个附件以逗号分隔
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

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderAccount() {
        return providerAccount;
    }

    public void setProviderAccount(String providerAccount) {
        this.providerAccount = providerAccount;
    }

    public String getOurBankAccount() {
        return ourBankAccount;
    }

    public void setOurBankAccount(String ourBankAccount) {
        this.ourBankAccount = ourBankAccount;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Integer handlerId) {
        this.handlerId = handlerId;
    }

    public Object getFillDate() {
        return fillDate;
    }

    public void setFillDate(Object fillDate) {
        this.fillDate = fillDate;
    }

    public String getPayComment() {
        return payComment;
    }

    public void setPayComment(String payComment) {
        this.payComment = payComment;
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