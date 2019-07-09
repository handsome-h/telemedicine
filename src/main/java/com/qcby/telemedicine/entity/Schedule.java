package com.qcby.telemedicine.entity;

import java.util.Date;

public class Schedule {
    private Long scheduleId;

    private Long userId;

    private Long docId;

    private String docName;

    private String docHead;

    private String department;

    private String patientName;

    private Integer patientAge;

    private Boolean patientSex;

    private String patientIdNumber;

    private String patientPhone;

    private String patientAddress;

    private String patientDisease;

    private String drugList;

    private String announcements;

    private Date createTime;

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    public String getDocHead() {
        return docHead;
    }

    public void setDocHead(String docHead) {
        this.docHead = docHead == null ? null : docHead.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
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

    public String getDrugList() {
        return drugList;
    }

    public void setDrugList(String drugList) {
        this.drugList = drugList == null ? null : drugList.trim();
    }

    public String getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String announcements) {
        this.announcements = announcements == null ? null : announcements.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}