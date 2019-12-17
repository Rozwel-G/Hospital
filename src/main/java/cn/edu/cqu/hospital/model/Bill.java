package cn.edu.cqu.hospital.model;

public class Bill {
    private String billId;

    private String examEntityId;

    private String registId;

    private String prescId;

    private String staffId;

    private Float billPrice;

    private String billState;

    private String billTime;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public String getExamEntityId() {
        return examEntityId;
    }

    public void setExamEntityId(String examEntityId) {
        this.examEntityId = examEntityId == null ? null : examEntityId.trim();
    }

    public String getRegistId() {
        return registId;
    }

    public void setRegistId(String registId) {
        this.registId = registId == null ? null : registId.trim();
    }

    public String getPrescId() {
        return prescId;
    }

    public void setPrescId(String prescId) {
        this.prescId = prescId == null ? null : prescId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public Float getBillPrice() {
        return billPrice;
    }

    public void setBillPrice(Float billPrice) {
        this.billPrice = billPrice;
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState == null ? null : billState.trim();
    }

    public String getBillTime() {
        return billTime;
    }

    public void setBillTime(String billTime) {
        this.billTime = billTime == null ? null : billTime.trim();
    }
}