package com.seiken_soft.entity;

public class TPasswordHistoryWithBLOBs extends TPasswordHistory {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}