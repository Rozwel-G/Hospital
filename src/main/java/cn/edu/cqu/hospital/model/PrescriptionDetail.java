package cn.edu.cqu.hospital.model;

public class PrescriptionDetail extends PrescriptionDetailKey {
    private Integer number;

    private String howUse;

    private String drugState;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHowUse() {
        return howUse;
    }

    public void setHowUse(String howUse) {
        this.howUse = howUse == null ? null : howUse.trim();
    }

    public String getDrugState() {
        return drugState;
    }

    public void setDrugState(String drugState) {
        this.drugState = drugState == null ? null : drugState.trim();
    }
}