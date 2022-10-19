package com.seiken_soft.entity;

public class TRoom {
    private String roomNumber;

    private String roomName;

    private String backColor;

    private String lockFlg;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor == null ? null : backColor.trim();
    }

    public String getLockFlg() {
        return lockFlg;
    }

    public void setLockFlg(String lockFlg) {
        this.lockFlg = lockFlg == null ? null : lockFlg.trim();
    }
}