package cn.edu.cqu.hospital.model;

public class Prescription {
    private String prescId;

    private String recardId;

    private String billId;

    private String prescState;

    private Float prescPrice;

    public String getPrescId() {
        return prescId;
    }

    public void setPrescId(String prescId) {
        this.prescId = prescId == null ? null : prescId.trim();
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

    public String getPrescState() {
        return prescState;
    }

    public void setPrescState(String prescState) {
        this.prescState = prescState == null ? null : prescState.trim();
    }

    public Float getPrescPrice() {
        return prescPrice;
    }

    public void setPrescPrice(Float prescPrice) {
        this.prescPrice = prescPrice;
    }
}