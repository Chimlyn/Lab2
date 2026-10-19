public class Patient extends User {
    private String medicalHistory;

    public Patient(String id, String name, String phone, String medicalHistory) {
        super(id, name, phone);
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
