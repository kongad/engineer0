package com.example.entity;

import java.io.Serializable;

/**
 * 项目立项信息(ProjectInfo)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public class ProjectInfo implements Serializable {
    private static final long serialVersionUID = 838365046075229001L;
    /**
    * 立项编号
    */
    private Integer id;
    /**
    * 项目名称
    */
    private String projectName;
    /**
    * 项目地址
    */
    private String projectAddress;
    /**
    * 项目跟踪人
    */
    private String projectTacker;
    /**
    * 计划开始日期
    */
    private Object startPlanDate;
    /**
    * 计划结束日期
    */
    private Object endPlanDate;
    /**
    * 工程工期
    */
    private String projectPeriod;
    /**
    * 工程造价
    */
    private Long projectCost;
    /**
    * 造价大写
    */
    private String costUpper;
    /**
    * 预计利润
    */
    private Double espectProfit;
    /**
    * 项目类型
    */
    private Integer projectType;
    /**
    * 质量等级
    */
    private String qualityLevel;
    /**
    * 项目状态
    */
    private String projectStatus;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 审批状态
    */
    private String approveStatus;
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
    * 联系地址
    */
    private String contactAddress;
    /**
    * 项目简介
    */
    private String projectIntrduce;
    /**
    * 备注
    */
    private String comment;
    /**
    * 立项人
    */
    private String creator;
    /**
    * 附件
    */
    private String attachIds;
    /**
    * 更新日期
    */
    private Object createDate;


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

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public String getProjectTacker() {
        return projectTacker;
    }

    public void setProjectTacker(String projectTacker) {
        this.projectTacker = projectTacker;
    }

    public Object getStartPlanDate() {
        return startPlanDate;
    }

    public void setStartPlanDate(Object startPlanDate) {
        this.startPlanDate = startPlanDate;
    }

    public Object getEndPlanDate() {
        return endPlanDate;
    }

    public void setEndPlanDate(Object endPlanDate) {
        this.endPlanDate = endPlanDate;
    }

    public String getProjectPeriod() {
        return projectPeriod;
    }

    public void setProjectPeriod(String projectPeriod) {
        this.projectPeriod = projectPeriod;
    }

    public Long getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(Long projectCost) {
        this.projectCost = projectCost;
    }

    public String getCostUpper() {
        return costUpper;
    }

    public void setCostUpper(String costUpper) {
        this.costUpper = costUpper;
    }

    public Double getEspectProfit() {
        return espectProfit;
    }

    public void setEspectProfit(Double espectProfit) {
        this.espectProfit = espectProfit;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
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

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getProjectIntrduce() {
        return projectIntrduce;
    }

    public void setProjectIntrduce(String projectIntrduce) {
        this.projectIntrduce = projectIntrduce;
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

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

    public Object getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Object createDate) {
        this.createDate = createDate;
    }

}