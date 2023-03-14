package com.seiken_soft.entity;

public class MColorKey {
    private String colorCd;

    public String getColorCd() {
        return colorCd;
    }

    public void setColorCd(String colorCd) {
        this.colorCd = colorCd == null ? null : colorCd.trim();
    }
}