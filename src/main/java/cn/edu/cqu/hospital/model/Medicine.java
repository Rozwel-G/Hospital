package cn.edu.cqu.hospital.model;

public class Medicine {
    private String medicineId;

    private String medicineName;

    private String medicineSpecification;

    private Integer medicineStock;

    private Float medicinePrice;

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId == null ? null : medicineId.trim();
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public String getMedicineSpecification() {
        return medicineSpecification;
    }

    public void setMedicineSpecification(String medicineSpecification) {
        this.medicineSpecification = medicineSpecification == null ? null : medicineSpecification.trim();
    }

    public Integer getMedicineStock() {
        return medicineStock;
    }

    public void setMedicineStock(Integer medicineStock) {
        this.medicineStock = medicineStock;
    }

    public Float getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(Float medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
}