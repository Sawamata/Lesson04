package com.seiken_soft.entity;

public class TRoommember extends TRoommemberKey {
    private String employeeName;

    private String checkInFlg;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getCheckInFlg() {
        return checkInFlg;
    }

    public void setCheckInFlg(String checkInFlg) {
        this.checkInFlg = checkInFlg == null ? null : checkInFlg.trim();
    }
}