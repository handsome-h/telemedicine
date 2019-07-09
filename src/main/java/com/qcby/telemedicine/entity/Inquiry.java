package com.qcby.telemedicine.entity;

import java.util.Date;

public class Inquiry {
    private Long inquiryId;

    private Long userId;

    private String userName;

    private String userHead;

    private Long docId;

    private String docName;

    private String docHead;

    private Boolean type;

    private Integer state;

    private String diseaseName;

    private String diseaseDesc;

    private String diseasePic;

    private String evaluate;

    private Date inquiryTime;

    private String reason;

    public Long getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(Long inquiryId) {
        this.inquiryId = inquiryId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
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

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public String getDiseaseDesc() {
        return diseaseDesc;
    }

    public void setDiseaseDesc(String diseaseDesc) {
        this.diseaseDesc = diseaseDesc == null ? null : diseaseDesc.trim();
    }

    public String getDiseasePic() {
        return diseasePic;
    }

    public void setDiseasePic(String diseasePic) {
        this.diseasePic = diseasePic == null ? null : diseasePic.trim();
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    public Date getInquiryTime() {
        return inquiryTime;
    }

    public void setInquiryTime(Date inquiryTime) {
        this.inquiryTime = inquiryTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}