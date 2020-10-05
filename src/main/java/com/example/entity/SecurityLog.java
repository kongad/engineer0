package com.example.entity;

import java.io.Serializable;

/**
 * 安全日志(SecurityLog)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class SecurityLog implements Serializable {
    private static final long serialVersionUID = -48298836378167068L;
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
    * 出勤人数
    */
    private Integer workerCount;
    /**
    * 部门ID
    */
    private Integer deptId;
    /**
    * 温度
    */
    private String temperature;
    /**
    * 日期
    */
    private Object updateDate;
    /**
    * 施工部位
    */
    private String workPart;
    /**
    * 当前施工安全情况
    */
    private String securitySituation;
    /**
    * 安全教育情况
    */
    private String securityEduation;
    /**
    * 安全交底
    */
    private String securityDisclosure;
    /**
    * 验收情况记录
    */
    private String acceptRecord;
    /**
    * 安全检查情况
    */
    private String securityCheck;
    /**
    * 安全会议记录
    */
    private String securityMeetingRecord;
    /**
    * 其他
    */
    private String other;
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

    public Integer getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

    public String getWorkPart() {
        return workPart;
    }

    public void setWorkPart(String workPart) {
        this.workPart = workPart;
    }

    public String getSecuritySituation() {
        return securitySituation;
    }

    public void setSecuritySituation(String securitySituation) {
        this.securitySituation = securitySituation;
    }

    public String getSecurityEduation() {
        return securityEduation;
    }

    public void setSecurityEduation(String securityEduation) {
        this.securityEduation = securityEduation;
    }

    public String getSecurityDisclosure() {
        return securityDisclosure;
    }

    public void setSecurityDisclosure(String securityDisclosure) {
        this.securityDisclosure = securityDisclosure;
    }

    public String getAcceptRecord() {
        return acceptRecord;
    }

    public void setAcceptRecord(String acceptRecord) {
        this.acceptRecord = acceptRecord;
    }

    public String getSecurityCheck() {
        return securityCheck;
    }

    public void setSecurityCheck(String securityCheck) {
        this.securityCheck = securityCheck;
    }

    public String getSecurityMeetingRecord() {
        return securityMeetingRecord;
    }

    public void setSecurityMeetingRecord(String securityMeetingRecord) {
        this.securityMeetingRecord = securityMeetingRecord;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

}