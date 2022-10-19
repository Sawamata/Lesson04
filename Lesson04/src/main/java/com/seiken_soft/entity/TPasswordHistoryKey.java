package com.seiken_soft.entity;

public class TPasswordHistoryKey {
    private String employeeId;

    private Long renban;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Long getRenban() {
        return renban;
    }

    public void setRenban(Long renban) {
        this.renban = renban;
    }
}