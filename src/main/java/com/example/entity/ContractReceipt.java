package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 合同收款(ContractReceipt)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class ContractReceipt implements Serializable {
    private static final long serialVersionUID = 319018327173079231L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pid;
    /**
    * 合同ID
    */
    private Integer ctrId;
    /**
    * 收款名称
    */
    private String receiptName;
    /**
    * 收款类型
    */
    private String receiptType;
    /**
    * 收款金额
    */
    private Double receiptAmount;
    /**
    * 收款金额大写
    */
    private String amountUpper;
    /**
    * 罚款
    */
    private Double penalty;
    /**
    * 扣款
    */
    private Double withhold;
    /**
    * 账户ID
    */
    private Integer accountId;
    /**
    * 填报人
    */
    private String applyer;
    /**
    * 填报日期
    */
    private Date applyDate;
    /**
    * 备注
    */
    private String comments;
    /**
    * 审批状态
    */
    private Integer approveStatus;
    /**
    * 更新人
    */
    private String updateUser;
    /**
    * 更新日期
    */
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCtrId() {
        return ctrId;
    }

    public void setCtrId(Integer ctrId) {
        this.ctrId = ctrId;
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public Double getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public String getAmountUpper() {
        return amountUpper;
    }

    public void setAmountUpper(String amountUpper) {
        this.amountUpper = amountUpper;
    }

    public Double getPenalty() {
        return penalty;
    }

    public void setPenalty(Double penalty) {
        this.penalty = penalty;
    }

    public Double getWithhold() {
        return withhold;
    }

    public void setWithhold(Double withhold) {
        this.withhold = withhold;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getApplyer() {
        return applyer;
    }

    public void setApplyer(String applyer) {
        this.applyer = applyer;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}