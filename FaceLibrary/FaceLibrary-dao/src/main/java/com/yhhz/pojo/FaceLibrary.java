package com.yhhz.pojo;

import java.util.Date;

public class FaceLibrary {
    private Long flId;

    private Date flDate;

    private Long userId;

    private String flFacegraphics;

    private String userName;

    public Long getFlId() {
        return flId;
    }

    public void setFlId(Long flId) {
        this.flId = flId;
    }

    public Date getFlDate() {
        return flDate;
    }

    public void setFlDate(Date flDate) {
        this.flDate = flDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFlFacegraphics() {
        return flFacegraphics;
    }

    public void setFlFacegraphics(String flFacegraphics) {
        this.flFacegraphics = flFacegraphics == null ? null : flFacegraphics.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}