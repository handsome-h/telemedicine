package com.qcby.telemedicine.entity;

import java.util.Date;

public class Registration {
    private Long  regId;

    private Long regNum;

    private Long userId;

    private String regDepartment;

    private Date regTime;

    private Date currentTime;

    private Boolean type;

    private Integer state;

    private String patientName;

    private Integer patientAge;

    private Boolean patientSex;

    private String patientIdNumber;

    private String patientPhone;

    private String patientAddress;

    private String patientDisease;

    public Long getregId() {
        return  regId;
    }

    public void setregId(Long  regId) {
        this. regId =  regId;
    }

    public Long getRegNum() {
        return regNum;
    }

    public void setRegNum(Long regNum) {
        this.regNum = regNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRegDepartment() {
        return regDepartment;
    }

    public void setRegDepartment(String regDepartment) {
        this.regDepartment = regDepartment == null ? null : regDepartment.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public Boolean getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(Boolean patientSex) {
        this.patientSex = patientSex;
    }

    public String getPatientIdNumber() {
        return patientIdNumber;
    }

    public void setPatientIdNumber(String patientIdNumber) {
        this.patientIdNumber = patientIdNumber == null ? null : patientIdNumber.trim();
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone == null ? null : patientPhone.trim();
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress == null ? null : patientAddress.trim();
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease == null ? null : patientDisease.trim();
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}