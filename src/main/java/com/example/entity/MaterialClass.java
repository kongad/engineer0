package com.example.entity;

import java.io.Serializable;

/**
 * 材料类别(MaterialClass)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:36
 */
public class MaterialClass implements Serializable {
    private static final long serialVersionUID = -78936451290583508L;
    /**
    * 编码
    */
    private Integer id;
    /**
    * 名称
    */
    private String name;
    /**
    * 父类型
    */
    private Integer parentId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}