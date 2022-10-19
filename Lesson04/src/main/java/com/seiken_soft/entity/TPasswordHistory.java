package com.seiken_soft.entity;

public class TPasswordHistory extends TPasswordHistoryKey {
    private Integer hashCount;

    private String password;

    public Integer getHashCount() {
        return hashCount;
    }

    public void setHashCount(Integer hashCount) {
        this.hashCount = hashCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}