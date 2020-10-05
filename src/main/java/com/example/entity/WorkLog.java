package com.example.entity;

import java.io.Serializable;

/**
 * 安全日志(WorkLog)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class WorkLog implements Serializable {
    private static final long serialVersionUID = -51295105415927652L;
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
    * 填写人
    */
    private Integer fillUser;
    /**
    * 日期
    */
    private Object updateDate;
    /**
    * 上午天气
    */
    private String forenoonWeather;
    /**
    * 下午天气
    */
    private String afternoonWeather;
    /**
    * 最低温度
    */
    private String lowTemperature;
    /**
    * 最高温度
    */
    private String highTemperature;
    /**
    * 现场图片
    */
    private String scenePicture;
    /**
    * 附件
    */
    private String attachIds;
    /**
    * 施工进展
    */
    private String workProgress;
    /**
    * 施工有关主要工作
    */
    private String mainWorks;
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

    public String getForenoonWeather() {
        return forenoonWeather;
    }

    public void setForenoonWeather(String forenoonWeather) {
        this.forenoonWeather = forenoonWeather;
    }

    public String getAfternoonWeather() {
        return afternoonWeather;
    }

    public void setAfternoonWeather(String afternoonWeather) {
        this.afternoonWeather = afternoonWeather;
    }

    public String getLowTemperature() {
        return lowTemperature;
    }

    public void setLowTemperature(String lowTemperature) {
        this.lowTemperature = lowTemperature;
    }

    public String getHighTemperature() {
        return highTemperature;
    }

    public void setHighTemperature(String highTemperature) {
        this.highTemperature = highTemperature;
    }

    public String getScenePicture() {
        return scenePicture;
    }

    public void setScenePicture(String scenePicture) {
        this.scenePicture = scenePicture;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

    public String getWorkProgress() {
        return workProgress;
    }

    public void setWorkProgress(String workProgress) {
        this.workProgress = workProgress;
    }

    public String getMainWorks() {
        return mainWorks;
    }

    public void setMainWorks(String mainWorks) {
        this.mainWorks = mainWorks;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

}