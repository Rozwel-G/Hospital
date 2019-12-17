package cn.edu.cqu.hospital.model;

import java.util.Date;

public class ExamEntity {
    private String examEntityId;

    private String recardId;

    private String billId;

    private String examId;

    private Date examEntityTime;

    private String drugState;

    private Float examEntityPrice;

    private String examEntityReport;

    public String getExamEntityId() {
        return examEntityId;
    }

    public void setExamEntityId(String examEntityId) {
        this.examEntityId = examEntityId == null ? null : examEntityId.trim();
    }

    public String getRecardId() {
        return recardId;
    }

    public void setRecardId(String recardId) {
        this.recardId = recardId == null ? null : recardId.trim();
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    public Date getExamEntityTime() {
        return examEntityTime;
    }

    public void setExamEntityTime(Date examEntityTime) {
        this.examEntityTime = examEntityTime;
    }

    public String getDrugState() {
        return drugState;
    }

    public void setDrugState(String drugState) {
        this.drugState = drugState == null ? null : drugState.trim();
    }

    public Float getExamEntityPrice() {
        return examEntityPrice;
    }

    public void setExamEntityPrice(Float examEntityPrice) {
        this.examEntityPrice = examEntityPrice;
    }

    public String getExamEntityReport() {
        return examEntityReport;
    }

    public void setExamEntityReport(String examEntityReport) {
        this.examEntityReport = examEntityReport == null ? null : examEntityReport.trim();
    }
}