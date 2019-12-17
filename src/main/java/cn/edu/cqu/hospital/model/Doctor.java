package cn.edu.cqu.hospital.model;

public class Doctor {
    private String doctorId;

    private String accountId;

    private String doctorName;

    private String doctorDepartment;

    private String doctorWorktime;

    private String doctorPosition;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getDoctorDepartment() {
        return doctorDepartment;
    }

    public void setDoctorDepartment(String doctorDepartment) {
        this.doctorDepartment = doctorDepartment == null ? null : doctorDepartment.trim();
    }

    public String getDoctorWorktime() {
        return doctorWorktime;
    }

    public void setDoctorWorktime(String doctorWorktime) {
        this.doctorWorktime = doctorWorktime == null ? null : doctorWorktime.trim();
    }

    public String getDoctorPosition() {
        return doctorPosition;
    }

    public void setDoctorPosition(String doctorPosition) {
        this.doctorPosition = doctorPosition == null ? null : doctorPosition.trim();
    }
}