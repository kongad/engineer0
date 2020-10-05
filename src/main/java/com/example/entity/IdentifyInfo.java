package com.example.entity;

import java.io.Serializable;

/**
 * 证件信息表(IdentifyInfo)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:37
 */
public class IdentifyInfo implements Serializable {
    private static final long serialVersionUID = -79707193816785522L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 性别
    */
    private String sex;
    /**
    * 部门
    */
    private Integer deptId;
    /**
    * 身份证号
    */
    private String identify;
    /**
    * 联系电话
    */
    private String phoneNum;
    /**
    * 发证单位
    */
    private String publicOrg;
    /**
    * 证书编号
    */
    private String credentialNo;
    /**
    * 证书类型
    */
    private String credentialType;
    /**
    * 注册编号
    */
    private String registerNo;
    /**
    * 资格证书编号
    */
    private String qualityNo;
    /**
    * 专业类别
    */
    private String majorType;
    /**
    * 有效截止时间
    */
    private Object expireDate;
    /**
    * 存放地点
    */
    private String saveAddress;
    /**
    * 证件录入人
    */
    private String credentialPerson;
    /**
    * 附件
    */
    private String attachIds;
    /**
    * 图片附件
    */
    private String pictureIds;
    /**
    * 更新日期
    */
    private Object updateDate;


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPublicOrg() {
        return publicOrg;
    }

    public void setPublicOrg(String publicOrg) {
        this.publicOrg = publicOrg;
    }

    public String getCredentialNo() {
        return credentialNo;
    }

    public void setCredentialNo(String credentialNo) {
        this.credentialNo = credentialNo;
    }

    public String getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public String getQualityNo() {
        return qualityNo;
    }

    public void setQualityNo(String qualityNo) {
        this.qualityNo = qualityNo;
    }

    public String getMajorType() {
        return majorType;
    }

    public void setMajorType(String majorType) {
        this.majorType = majorType;
    }

    public Object getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Object expireDate) {
        this.expireDate = expireDate;
    }

    public String getSaveAddress() {
        return saveAddress;
    }

    public void setSaveAddress(String saveAddress) {
        this.saveAddress = saveAddress;
    }

    public String getCredentialPerson() {
        return credentialPerson;
    }

    public void setCredentialPerson(String credentialPerson) {
        this.credentialPerson = credentialPerson;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

    public String getPictureIds() {
        return pictureIds;
    }

    public void setPictureIds(String pictureIds) {
        this.pictureIds = pictureIds;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

}