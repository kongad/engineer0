package com.example.entity;

import java.io.Serializable;

/**
 * 施工日志明细(WorkLogDetail)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class WorkLogDetail implements Serializable {
    private static final long serialVersionUID = 187524515601853251L;
    /**
    * 编号
    */
    private Integer 编号;
    /**
    * 施工日志ID
    */
    private Integer 施工日志id;
    /**
    * 施工班组
    */
    private Integer 施工班组;
    /**
    * 施工人数
    */
    private Integer 施工人数;
    /**
    * 施工内容
    */
    private String 施工内容;
    /**
    * 备注
    */
    private String 备注;


    public Integer get编号() {
        return 编号;
    }

    public void set编号(Integer 编号) {
        this.编号 = 编号;
    }

    public Integer get施工日志id() {
        return 施工日志id;
    }

    public void set施工日志id(Integer 施工日志id) {
        this.施工日志id = 施工日志id;
    }

    public Integer get施工班组() {
        return 施工班组;
    }

    public void set施工班组(Integer 施工班组) {
        this.施工班组 = 施工班组;
    }

    public Integer get施工人数() {
        return 施工人数;
    }

    public void set施工人数(Integer 施工人数) {
        this.施工人数 = 施工人数;
    }

    public String get施工内容() {
        return 施工内容;
    }

    public void set施工内容(String 施工内容) {
        this.施工内容 = 施工内容;
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

}