package com.example.entity;

import java.io.Serializable;

/**
 * 施工日志明细(WorkOrgPlan)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class WorkOrgPlan implements Serializable {
    private static final long serialVersionUID = 988845059791972309L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 填报人
    */
    private Integer fillUser;
    /**
    * 方案说明
    */
    private String planComment;
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

    public Integer getFillUser() {
        return fillUser;
    }

    public void setFillUser(Integer fillUser) {
        this.fillUser = fillUser;
    }

    public String getPlanComment() {
        return planComment;
    }

    public void setPlanComment(String planComment) {
        this.planComment = planComment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}