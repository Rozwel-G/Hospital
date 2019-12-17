package cn.edu.cqu.hospital.model;

public class Regist {
    private String registId;

    private String accountId;

    private String doctorId;

    private String billId;

    private String registState;

    private String registTime;

    private String registDepartment;

    private Boolean registIsExpert;

    private String registQueueNum;

    public String getRegistId() {
        return registId;
    }

    public void setRegistId(String registId) {
        this.registId = registId == null ? null : registId.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public String getRegistState() {
        return registState;
    }

    public void setRegistState(String registState) {
        this.registState = registState == null ? null : registState.trim();
    }

    public String getRegistTime() {
        return registTime;
    }

    public void setRegistTime(String registTime) {
        this.registTime = registTime == null ? null : registTime.trim();
    }

    public String getRegistDepartment() {
        return registDepartment;
    }

    public void setRegistDepartment(String registDepartment) {
        this.registDepartment = registDepartment == null ? null : registDepartment.trim();
    }

    public Boolean getRegistIsExpert() {
        return registIsExpert;
    }

    public void setRegistIsExpert(Boolean registIsExpert) {
        this.registIsExpert = registIsExpert;
    }

    public String getRegistQueueNum() {
        return registQueueNum;
    }

    public void setRegistQueueNum(String registQueueNum) {
        this.registQueueNum = registQueueNum == null ? null : registQueueNum.trim();
    }
}