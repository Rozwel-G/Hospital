package cn.edu.cqu.hospital.model;

public class Examination {
    private String examId;

    private String examName;

    private String examDepartment;

    private String examDetail;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public String getExamDepartment() {
        return examDepartment;
    }

    public void setExamDepartment(String examDepartment) {
        this.examDepartment = examDepartment == null ? null : examDepartment.trim();
    }

    public String getExamDetail() {
        return examDetail;
    }

    public void setExamDetail(String examDetail) {
        this.examDetail = examDetail == null ? null : examDetail.trim();
    }
}