package cn.edu.cqu.hospital.model;

public class Staff {
    private String staffId;

    private String accountId;

    private String staffName;

    private String staffPart;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffPart() {
        return staffPart;
    }

    public void setStaffPart(String staffPart) {
        this.staffPart = staffPart == null ? null : staffPart.trim();
    }
}