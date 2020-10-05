package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 投标项目信息(TenderProjectInfo)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class TenderProjectInfo implements Serializable {
    private static final long serialVersionUID = 613167247299270527L;
    /**
    * 投标编号
    */
    private Integer id;
    /**
    * 项目名称
    */
    private String projectName;
    /**
    * 项目简介
    */
    private String projectIntrduce;
    /**
    * 项目地址
    */
    private String projectAddress;
    /**
    * 项目类型
    */
    private Integer projectType;
    /**
    * 负责投标人
    */
    private String bidder;
    /**
    * 预计投标日期
    */
    private Date pretenderDate;
    /**
    * 预计投标费用
    */
    private Double pretenderFee;
    /**
    * 预计投标金额
    */
    private Double pretenderAmount;
    /**
    * 建设单位
    */
    private String buildCompany;
    /**
    * 联系人
    */
    private String contactor;
    /**
    * 联系电话
    */
    private String contactPhone;
    /**
    * 设计单位
    */
    private String designCompany;
    /**
    * 监理单位
    */
    private String superviderCompany;
    /**
    * 备注
    */
    private String comment;
    /**
    * 录入人
    */
    private String creator;
    /**
    * 录入日期
    */
    private Object createDate;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 审批状态
    */
    private String approveStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectIntrduce() {
        return projectIntrduce;
    }

    public void setProjectIntrduce(String projectIntrduce) {
        this.projectIntrduce = projectIntrduce;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public String getBidder() {
        return bidder;
    }

    public void setBidder(String bidder) {
        this.bidder = bidder;
    }

    public Date getPretenderDate() {
        return pretenderDate;
    }

    public void setPretenderDate(Date pretenderDate) {
        this.pretenderDate = pretenderDate;
    }

    public Double getPretenderFee() {
        return pretenderFee;
    }

    public void setPretenderFee(Double pretenderFee) {
        this.pretenderFee = pretenderFee;
    }

    public Double getPretenderAmount() {
        return pretenderAmount;
    }

    public void setPretenderAmount(Double pretenderAmount) {
        this.pretenderAmount = pretenderAmount;
    }

    public String getBuildCompany() {
        return buildCompany;
    }

    public void setBuildCompany(String buildCompany) {
        this.buildCompany = buildCompany;
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getDesignCompany() {
        return designCompany;
    }

    public void setDesignCompany(String designCompany) {
        this.designCompany = designCompany;
    }

    public String getSuperviderCompany() {
        return superviderCompany;
    }

    public void setSuperviderCompany(String superviderCompany) {
        this.superviderCompany = superviderCompany;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Object getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Object createDate) {
        this.createDate = createDate;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

}