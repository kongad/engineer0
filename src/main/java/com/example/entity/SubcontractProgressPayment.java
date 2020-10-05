package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 分包进度款申报(SubcontractProgressPayment)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class SubcontractProgressPayment implements Serializable {
    private static final long serialVersionUID = -78216275791294676L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 合同ID
    */
    private Integer ctrId;
    /**
    * 分包单位ID
    */
    private Integer companyId;
    /**
    * 合同名称
    */
    private String contractName;
    /**
    * 合同金额
    */
    private Double contractAmount;
    /**
    * 结算类型
    */
    private String settleType;
    /**
    * 批复金额
    */
    private Double agreeAmount;
    /**
    * 收款金额大写
    */
    private String agreeUpper;
    /**
    * 罚款
    */
    private Double penalty;
    /**
    * 扣款
    */
    private Double withhold;
    /**
    * 结算说明
    */
    private String settleComment;
    /**
    * 经办人
    */
    private Integer handlerId;
    /**
    * 申报日期
    */
    private Date applyDate;
    /**
    * 附件
    */
    private String attachIds;
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

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getCtrId() {
        return ctrId;
    }

    public void setCtrId(Integer ctrId) {
        this.ctrId = ctrId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public Double getAgreeAmount() {
        return agreeAmount;
    }

    public void setAgreeAmount(Double agreeAmount) {
        this.agreeAmount = agreeAmount;
    }

    public String getAgreeUpper() {
        return agreeUpper;
    }

    public void setAgreeUpper(String agreeUpper) {
        this.agreeUpper = agreeUpper;
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

    public String getSettleComment() {
        return settleComment;
    }

    public void setSettleComment(String settleComment) {
        this.settleComment = settleComment;
    }

    public Integer getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Integer handlerId) {
        this.handlerId = handlerId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
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