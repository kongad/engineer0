package com.example.entity;

import java.io.Serializable;

/**
 * 材料需用计划明细(MaterialUseDetail)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:35
 */
public class MaterialUseDetail implements Serializable {
    private static final long serialVersionUID = 383237102315466025L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 需用计划编号
    */
    private Integer useId;
    /**
    * 物资ID
    */
    private Integer mateId;
    /**
    * 需用数量
    */
    private Long useCount;
    /**
    * 参考价格
    */
    private Double referencePrice;
    /**
    * 使用部位
    */
    private String useTo;
    /**
    * 备注
    */
    private String comment;
    /**
    * Column_8
    */
    private String column8;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public Integer getMateId() {
        return mateId;
    }

    public void setMateId(Integer mateId) {
        this.mateId = mateId;
    }

    public Long getUseCount() {
        return useCount;
    }

    public void setUseCount(Long useCount) {
        this.useCount = useCount;
    }

    public Double getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(Double referencePrice) {
        this.referencePrice = referencePrice;
    }

    public String getUseTo() {
        return useTo;
    }

    public void setUseTo(String useTo) {
        this.useTo = useTo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getColumn8() {
        return column8;
    }

    public void setColumn8(String column8) {
        this.column8 = column8;
    }

}