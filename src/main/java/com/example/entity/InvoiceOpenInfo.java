package com.example.entity;

import java.io.Serializable;

/**
 * 发票开票登记表(InvoiceOpenInfo)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:32
 */
public class InvoiceOpenInfo implements Serializable {
    private static final long serialVersionUID = -90911823047882238L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 合同ID
    */
    private Integer cId;
    /**
    * 收票单位
    */
    private Integer receiveCompanyId;
    /**
    * 开票单位
    */
    private Integer openCompanyId;
    /**
    * 发票类型
    */
    private String invoiceType;
    /**
    * 发票号码
    */
    private String invoiceNo;
    /**
    * 发票金额
    */
    private Double invoiceAmount;
    /**
    * 开户银行
    */
    private String accountBank;
    /**
    * 账号
    */
    private String accountNum;
    /**
    * 纳税人识别号
    */
    private String taxplayerNo;
    /**
    * 电话、地址
    */
    private String phoneAddress;
    /**
    * 填报人
    */
    private String editer;
    /**
    * 日期
    */
    private Object openDate;
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

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getReceiveCompanyId() {
        return receiveCompanyId;
    }

    public void setReceiveCompanyId(Integer receiveCompanyId) {
        this.receiveCompanyId = receiveCompanyId;
    }

    public Integer getOpenCompanyId() {
        return openCompanyId;
    }

    public void setOpenCompanyId(Integer openCompanyId) {
        this.openCompanyId = openCompanyId;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getTaxplayerNo() {
        return taxplayerNo;
    }

    public void setTaxplayerNo(String taxplayerNo) {
        this.taxplayerNo = taxplayerNo;
    }

    public String getPhoneAddress() {
        return phoneAddress;
    }

    public void setPhoneAddress(String phoneAddress) {
        this.phoneAddress = phoneAddress;
    }

    public String getEditer() {
        return editer;
    }

    public void setEditer(String editer) {
        this.editer = editer;
    }

    public Object getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Object openDate) {
        this.openDate = openDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}