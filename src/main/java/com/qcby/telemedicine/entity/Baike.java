package com.qcby.telemedicine.entity;

public class Baike {
    private Long baikeId;

    private String symName;

    private String symDesc;

    private String pathogeny;

    private String inspection;

    private String diagnosis;

    private String precaution;

    private String anesis;

    public Long getBaikeId() {
        return baikeId;
    }

    public void setBaikeId(Long baikeId) {
        this.baikeId = baikeId;
    }

    public String getSymName() {
        return symName;
    }

    public void setSymName(String symName) {
        this.symName = symName == null ? null : symName.trim();
    }

    public String getSymDesc() {
        return symDesc;
    }

    public void setSymDesc(String symDesc) {
        this.symDesc = symDesc == null ? null : symDesc.trim();
    }

    public String getPathogeny() {
        return pathogeny;
    }

    public void setPathogeny(String pathogeny) {
        this.pathogeny = pathogeny == null ? null : pathogeny.trim();
    }

    public String getInspection() {
        return inspection;
    }

    public void setInspection(String inspection) {
        this.inspection = inspection == null ? null : inspection.trim();
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    public String getPrecaution() {
        return precaution;
    }

    public void setPrecaution(String precaution) {
        this.precaution = precaution == null ? null : precaution.trim();
    }

    public String getAnesis() {
        return anesis;
    }

    public void setAnesis(String anesis) {
        this.anesis = anesis == null ? null : anesis.trim();
    }
}