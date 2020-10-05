package com.example.entity;

import java.io.Serializable;

/**
 * 质量巡检(QualityInspect)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class QualityInspect implements Serializable {
    private static final long serialVersionUID = 128021986574779849L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 检查部位
    */
    private String checkPart;
    /**
    * 质检员ID
    */
    private Integer qualityerId;
    /**
    * 检查情况
    */
    private String checkSituation;
    /**
    * 纠正防范措施
    */
    private String corretivePreventiveMeasure;
    /**
    * 备注
    */
    private String comment;
    /**
    * 附件IDs
    */
    private String attacheIds;
    /**
    * 检查日期
    */
    private Object checkDate;
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

    public String getCheckPart() {
        return checkPart;
    }

    public void setCheckPart(String checkPart) {
        this.checkPart = checkPart;
    }

    public Integer getQualityerId() {
        return qualityerId;
    }

    public void setQualityerId(Integer qualityerId) {
        this.qualityerId = qualityerId;
    }

    public String getCheckSituation() {
        return checkSituation;
    }

    public void setCheckSituation(String checkSituation) {
        this.checkSituation = checkSituation;
    }

    public String getCorretivePreventiveMeasure() {
        return corretivePreventiveMeasure;
    }

    public void setCorretivePreventiveMeasure(String corretivePreventiveMeasure) {
        this.corretivePreventiveMeasure = corretivePreventiveMeasure;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAttacheIds() {
        return attacheIds;
    }

    public void setAttacheIds(String attacheIds) {
        this.attacheIds = attacheIds;
    }

    public Object getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Object checkDate) {
        this.checkDate = checkDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}