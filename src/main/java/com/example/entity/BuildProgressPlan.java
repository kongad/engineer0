package com.example.entity;

import java.io.Serializable;

/**
 * 施工进度计划(BuildProgressPlan)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public class BuildProgressPlan implements Serializable {
    private static final long serialVersionUID = -41099489050088819L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 施工主任务
    */
    private String mainTask;
    /**
    * 施工子任务
    */
    private String subTask;
    /**
    * 开始日期
    */
    private Object startDate;
    /**
    * 结算日期
    */
    private Object endDate;


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

    public String getMainTask() {
        return mainTask;
    }

    public void setMainTask(String mainTask) {
        this.mainTask = mainTask;
    }

    public String getSubTask() {
        return subTask;
    }

    public void setSubTask(String subTask) {
        this.subTask = subTask;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

}