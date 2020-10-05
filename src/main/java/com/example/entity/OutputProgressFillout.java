package com.example.entity;

import java.io.Serializable;

/**
 * 产值进度填报主表(OutputProgressFillout)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public class OutputProgressFillout implements Serializable {
    private static final long serialVersionUID = 700573410097634016L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 填报名称
    */
    private String fillSubject;
    /**
    * 填报人
    */
    private String editerId;
    /**
    * 日期
    */
    private Object fillDate;
    /**
    * 合计
    */
    private Double totalAmount;
    /**
    * 合计大写
    */
    private Double totalUpper;
    /**
    * 附件
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

    public String getFillSubject() {
        return fillSubject;
    }

    public void setFillSubject(String fillSubject) {
        this.fillSubject = fillSubject;
    }

    public String getEditerId() {
        return editerId;
    }

    public void setEditerId(String editerId) {
        this.editerId = editerId;
    }

    public Object getFillDate() {
        return fillDate;
    }

    public void setFillDate(Object fillDate) {
        this.fillDate = fillDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalUpper() {
        return totalUpper;
    }

    public void setTotalUpper(Double totalUpper) {
        this.totalUpper = totalUpper;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

}