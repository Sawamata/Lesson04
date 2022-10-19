package com.seiken_soft.entity;

public class TRoomtalkWithBLOBs extends TRoomtalk {
    private String talk;

    private String tempFile;

    private String imageFile;

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk == null ? null : talk.trim();
    }

    public String getTempFile() {
        return tempFile;
    }

    public void setTempFile(String tempFile) {
        this.tempFile = tempFile == null ? null : tempFile.trim();
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile == null ? null : imageFile.trim();
    }
}