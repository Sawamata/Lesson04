package com.seiken_soft.entity;

public class TDutyKey {
    private String employeeId;

    private String dutyMonth;

    private String dutyDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getDutyMonth() {
        return dutyMonth;
    }

    public void setDutyMonth(String dutyMonth) {
        this.dutyMonth = dutyMonth == null ? null : dutyMonth.trim();
    }

    public String getDutyDate() {
        return dutyDate;
    }

    public void setDutyDate(String dutyDate) {
        this.dutyDate = dutyDate == null ? null : dutyDate.trim();
    }
}