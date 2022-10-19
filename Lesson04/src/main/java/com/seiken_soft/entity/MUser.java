package com.seiken_soft.entity;

public class MUser {
    private String employeeId;

    private Integer hashCount;

    private String fontColor;

    private String backgroundColor;

    private Integer retryCount;

    private String lockFlg;

    private String deleteFlg;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Integer getHashCount() {
        return hashCount;
    }

    public void setHashCount(Integer hashCount) {
        this.hashCount = hashCount;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor == null ? null : fontColor.trim();
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor == null ? null : backgroundColor.trim();
    }

    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public String getLockFlg() {
        return lockFlg;
    }

    public void setLockFlg(String lockFlg) {
        this.lockFlg = lockFlg == null ? null : lockFlg.trim();
    }

    public String getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg == null ? null : deleteFlg.trim();
    }
}