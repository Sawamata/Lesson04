package com.seiken_soft.entity;

public class TRoomtalkKey {
    private String roomNumber;

    private String employeeId;

    private Long renban;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

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