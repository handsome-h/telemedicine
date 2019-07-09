package com.qcby.telemedicine.entity;

public class Doctor {
    private Long docId;

    private String docAccount;

    private String docPwd;

    private String docHead;

    private String docName;

    private Integer docAge;

    private Boolean docSex;

    private String docIdNumber;

    private String department;

    private String skills;

    private String introduction;

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public String getDocAccount() {
        return docAccount;
    }

    public void setDocAccount(String docAccount) {
        this.docAccount = docAccount == null ? null : docAccount.trim();
    }

    public String getDocPwd() {
        return docPwd;
    }

    public void setDocPwd(String docPwd) {
        this.docPwd = docPwd == null ? null : docPwd.trim();
    }

    public String getDocHead() {
        return docHead;
    }

    public void setDocHead(String docHead) {
        this.docHead = docHead == null ? null : docHead.trim();
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    public Integer getDocAge() {
        return docAge;
    }

    public void setDocAge(Integer docAge) {
        this.docAge = docAge;
    }

    public Boolean getDocSex() {
        return docSex;
    }

    public void setDocSex(Boolean docSex) {
        this.docSex = docSex;
    }

    public String getDocIdNumber() {
        return docIdNumber;
    }

    public void setDocIdNumber(String docIdNumber) {
        this.docIdNumber = docIdNumber == null ? null : docIdNumber.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills == null ? null : skills.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}