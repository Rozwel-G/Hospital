package cn.edu.cqu.hospital.model;

import java.util.Date;

public class Recard {
    private String recardId;

    private String doctorId;

    private String patientId;

    private Date recardTime;

    private String recardDepartment;

    private String recardContent;

    public String getRecardId() {
        return recardId;
    }

    public void setRecardId(String recardId) {
        this.recardId = recardId == null ? null : recardId.trim();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public Date getRecardTime() {
        return recardTime;
    }

    public void setRecardTime(Date recardTime) {
        this.recardTime = recardTime;
    }

    public String getRecardDepartment() {
        return recardDepartment;
    }

    public void setRecardDepartment(String recardDepartment) {
        this.recardDepartment = recardDepartment == null ? null : recardDepartment.trim();
    }

    public String getRecardContent() {
        return recardContent;
    }

    public void setRecardContent(String recardContent) {
        this.recardContent = recardContent == null ? null : recardContent.trim();
    }
}