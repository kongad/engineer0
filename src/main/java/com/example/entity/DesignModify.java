package com.example.entity;

import java.io.Serializable;

/**
 * 设计变更(DesignModify)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public class DesignModify implements Serializable {
    private static final long serialVersionUID = 757193731987040871L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 所属合同ID
    */
    private Integer contractId;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 填写人
    */
    private Integer fillUser;
    /**
    * 日期
    */
    private Object updateDate;
    /**
    * 审批状态
    */
    private String approveStatus;
    /**
    * 变更金额
    */
    private Double modifyAmount;
    /**
    * 变更金额大写
    */
    private String amountUpper;
    /**
    * 提出变更单位
    */
    private Integer modifyApplyCompany;
    /**
    * 原图纸及附件
    */
    private String orignalAttachIds;
    /**
    * 变更图纸及附件
    */
    private String modifyAttachIds;
    /**
    * 变更原因
    */
    private String modifyReason;
    /**
    * 变更内容
    */
    private String modifyContent;
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

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getFillUser() {
        return fillUser;
    }

    public void setFillUser(Integer fillUser) {
        this.fillUser = fillUser;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public Double getModifyAmount() {
        return modifyAmount;
    }

    public void setModifyAmount(Double modifyAmount) {
        this.modifyAmount = modifyAmount;
    }

    public String getAmountUpper() {
        return amountUpper;
    }

    public void setAmountUpper(String amountUpper) {
        this.amountUpper = amountUpper;
    }

    public Integer getModifyApplyCompany() {
        return modifyApplyCompany;
    }

    public void setModifyApplyCompany(Integer modifyApplyCompany) {
        this.modifyApplyCompany = modifyApplyCompany;
    }

    public String getOrignalAttachIds() {
        return orignalAttachIds;
    }

    public void setOrignalAttachIds(String orignalAttachIds) {
        this.orignalAttachIds = orignalAttachIds;
    }

    public String getModifyAttachIds() {
        return modifyAttachIds;
    }

    public void setModifyAttachIds(String modifyAttachIds) {
        this.modifyAttachIds = modifyAttachIds;
    }

    public String getModifyReason() {
        return modifyReason;
    }

    public void setModifyReason(String modifyReason) {
        this.modifyReason = modifyReason;
    }

    public String getModifyContent() {
        return modifyContent;
    }

    public void setModifyContent(String modifyContent) {
        this.modifyContent = modifyContent;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}