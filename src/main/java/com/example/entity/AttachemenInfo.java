package com.example.entity;

import java.io.Serializable;

/**
 * 附件文件表(AttachemenInfo)实体类
 *
 * @author makejava
 * @since 2020-10-05 10:18:38
 */
public class AttachemenInfo implements Serializable {
    private static final long serialVersionUID = 253512842380942168L;
    /**
    * 编码
    */
    private Integer id;
    /**
    * 文件名称
    */
    private String fileName;
    /**
    * 文件类型
    */
    private String fileType;
    /**
    * 文件路径
    */
    private String filePath;
    /**
    * 文件关联表ID
    */
    private Integer relativeId;
    /**
    * 上次时间
    */
    private Object uploadDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getRelativeId() {
        return relativeId;
    }

    public void setRelativeId(Integer relativeId) {
        this.relativeId = relativeId;
    }

    public Object getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Object uploadDate) {
        this.uploadDate = uploadDate;
    }

}