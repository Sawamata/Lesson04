package com.seiken_soft.entity;

public class TRoomtalk extends TRoomtalkKey {
    private String fontColor;

    private String backColor;

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor == null ? null : fontColor.trim();
    }

    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor == null ? null : backColor.trim();
    }
}