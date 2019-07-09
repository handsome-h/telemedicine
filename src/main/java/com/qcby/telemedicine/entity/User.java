package com.qcby.telemedicine.entity;

public class User {
    private Long userId;

    private String userAccount;

    private String userPwd;

    private String userHead;

    private String userName;

    private Integer userAge;

    private Boolean userSex;

    private String userIdNumber;

    private String userPhone;

    private String userAddress;

    private String medicalHistory;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    public String getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber == null ? null : userIdNumber.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory == null ? null : medicalHistory.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userHead='" + userHead + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                ", userIdNumber='" + userIdNumber + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", medicalHistory='" + medicalHistory + '\'' +
                '}';
    }
}