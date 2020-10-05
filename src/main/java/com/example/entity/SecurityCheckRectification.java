package com.example.entity;

import java.io.Serializable;

/**
 * 安全检查记录整改(SecurityCheckRectification)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class SecurityCheckRectification implements Serializable {
    private static final long serialVersionUID = -80432554174108501L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 检查人
    */
    private String checker;
    /**
    * 工程规模
    */
    private String buildScale;
    /**
    * 形象进度
    */
    private String progress;
    /**
    * 日期
    */
    private Object updateDate;
    /**
    * 施工部位
    */
    private String buildPart;
    /**
    * 基本情况
    */
    private String basicSituation;
    /**
    * 现场检查情况
    */
    private String sceneCheckSituation;
    /**
    * 处理要求及措施
    */
    private String handleMeasure;
    /**
    * 复查情况
    */
    private String recheckSituation;
    /**
    * 复查人签字
    */
    private String recheckSignature;
    /**
    * 审批状态
    */
    private String approveStatus;
    /**
    * 附件IDs
    */
    private String attachIds;


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

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getBuildScale() {
        return buildScale;
    }

    public void setBuildScale(String buildScale) {
        this.buildScale = buildScale;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

    public String getBuildPart() {
        return buildPart;
    }

    public void setBuildPart(String buildPart) {
        this.buildPart = buildPart;
    }

    public String getBasicSituation() {
        return basicSituation;
    }

    public void setBasicSituation(String basicSituation) {
        this.basicSituation = basicSituation;
    }

    public String getSceneCheckSituation() {
        return sceneCheckSituation;
    }

    public void setSceneCheckSituation(String sceneCheckSituation) {
        this.sceneCheckSituation = sceneCheckSituation;
    }

    public String getHandleMeasure() {
        return handleMeasure;
    }

    public void setHandleMeasure(String handleMeasure) {
        this.handleMeasure = handleMeasure;
    }

    public String getRecheckSituation() {
        return recheckSituation;
    }

    public void setRecheckSituation(String recheckSituation) {
        this.recheckSituation = recheckSituation;
    }

    public String getRecheckSignature() {
        return recheckSignature;
    }

    public void setRecheckSignature(String recheckSignature) {
        this.recheckSignature = recheckSignature;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

}