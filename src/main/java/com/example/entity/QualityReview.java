package com.example.entity;

import java.io.Serializable;

/**
 * 资格自审(QualityReview)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public class QualityReview implements Serializable {
    private static final long serialVersionUID = 127028647657876464L;
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
    * 申请人
    */
    private String applyer;
    /**
    * 备注
    */
    private String comment;
    /**
    * 附件
    */
    private String attachements;
    /**
    * 申请日期
    */
    private Object applyDate;
    /**
    * 更新日期
    */
    private Object updateDate;
    /**
    * 更新人
    */
    private String updateUser;


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

    public String getApplyer() {
        return applyer;
    }

    public void setApplyer(String applyer) {
        this.applyer = applyer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAttachements() {
        return attachements;
    }

    public void setAttachements(String attachements) {
        this.attachements = attachements;
    }

    public Object getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Object applyDate) {
        this.applyDate = applyDate;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}