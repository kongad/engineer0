package com.example.entity;

import java.io.Serializable;

/**
 * 租赁计划(LeasePlan)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class LeasePlan implements Serializable {
    private static final long serialVersionUID = -42995256640610384L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 租赁计划名称
    */
    private String planName;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 填报人
    */
    private String fillUser;
    /**
    * 填报日期
    */
    private Object fillDate;
    /**
    * 用途
    */
    private String useTo;
    /**
    * 附件
    */
    private String attachIds;
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

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
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

    public String getFillUser() {
        return fillUser;
    }

    public void setFillUser(String fillUser) {
        this.fillUser = fillUser;
    }

    public Object getFillDate() {
        return fillDate;
    }

    public void setFillDate(Object fillDate) {
        this.fillDate = fillDate;
    }

    public String getUseTo() {
        return useTo;
    }

    public void setUseTo(String useTo) {
        this.useTo = useTo;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

}