package cn.edu.cqu.hospital.model;

public class PrescriptionKey {
    private String prescId;

    private String medicineId;

    public String getPrescId() {
        return prescId;
    }

    public void setPrescId(String prescId) {
        this.prescId = prescId == null ? null : prescId.trim();
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId == null ? null : medicineId.trim();
    }
}