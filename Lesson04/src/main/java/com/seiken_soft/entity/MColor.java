package com.seiken_soft.entity;

public class MColor {
    private String colorCd;

    private String colorName;

    private String colorValue;

    public String getColorCd() {
        return colorCd;
    }

    public void setColorCd(String colorCd) {
        this.colorCd = colorCd == null ? null : colorCd.trim();
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName == null ? null : colorName.trim();
    }

    public String getColorValue() {
        return colorValue;
    }

    public void setColorValue(String colorValue) {
        this.colorValue = colorValue == null ? null : colorValue.trim();
    }
}