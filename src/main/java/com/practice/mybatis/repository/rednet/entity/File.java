package com.practice.mybatis.repository.rednet.entity;

import java.util.Date;

public class File {
    private Long resourceId;

    private Long parentId;

    private Long memberId;

    private Long tenantId;

    private Byte fromType;

    private String filename;

    private String filetype;

    private String coverObjectpath;

    private Byte libraryType;

    private Byte storehouseType;

    private Byte resourceType;

    private Boolean isDir;

    private Boolean isOnShelf;

    private Boolean isOpen;

    private Boolean isShared;

    private Boolean isInRecyclebin;

    private Boolean isCoverCustomed;

    private Byte reviewState;

    private Byte transcodeState;

    private Byte watermarkState;

    private Boolean isOld;

    private Date updateTime;

    private Date createTime;

    private Date deleteTime;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Byte getFromType() {
        return fromType;
    }

    public void setFromType(Byte fromType) {
        this.fromType = fromType;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getCoverObjectpath() {
        return coverObjectpath;
    }

    public void setCoverObjectpath(String coverObjectpath) {
        this.coverObjectpath = coverObjectpath == null ? null : coverObjectpath.trim();
    }

    public Byte getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(Byte libraryType) {
        this.libraryType = libraryType;
    }

    public Byte getStorehouseType() {
        return storehouseType;
    }

    public void setStorehouseType(Byte storehouseType) {
        this.storehouseType = storehouseType;
    }

    public Byte getResourceType() {
        return resourceType;
    }

    public void setResourceType(Byte resourceType) {
        this.resourceType = resourceType;
    }

    public Boolean getIsDir() {
        return isDir;
    }

    public void setIsDir(Boolean isDir) {
        this.isDir = isDir;
    }

    public Boolean getIsOnShelf() {
        return isOnShelf;
    }

    public void setIsOnShelf(Boolean isOnShelf) {
        this.isOnShelf = isOnShelf;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsShared() {
        return isShared;
    }

    public void setIsShared(Boolean isShared) {
        this.isShared = isShared;
    }

    public Boolean getIsInRecyclebin() {
        return isInRecyclebin;
    }

    public void setIsInRecyclebin(Boolean isInRecyclebin) {
        this.isInRecyclebin = isInRecyclebin;
    }

    public Boolean getIsCoverCustomed() {
        return isCoverCustomed;
    }

    public void setIsCoverCustomed(Boolean isCoverCustomed) {
        this.isCoverCustomed = isCoverCustomed;
    }

    public Byte getReviewState() {
        return reviewState;
    }

    public void setReviewState(Byte reviewState) {
        this.reviewState = reviewState;
    }

    public Byte getTranscodeState() {
        return transcodeState;
    }

    public void setTranscodeState(Byte transcodeState) {
        this.transcodeState = transcodeState;
    }

    public Byte getWatermarkState() {
        return watermarkState;
    }

    public void setWatermarkState(Byte watermarkState) {
        this.watermarkState = watermarkState;
    }

    public Boolean getIsOld() {
        return isOld;
    }

    public void setIsOld(Boolean isOld) {
        this.isOld = isOld;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}