package com.example.entity;

import java.io.Serializable;

/**
 * 组织机构表(OrgTb)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class OrgTb implements Serializable {
    private static final long serialVersionUID = -35567225468520685L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 部门名称
    */
    private String orgName;
    /**
    * 上级部门编号
    */
    private Integer parentId;
    /**
    * 显示顺序
    */
    private Integer showOrder;
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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
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