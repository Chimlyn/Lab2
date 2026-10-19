public class Case {
    private String caseId;
    private String patientId;
    private String doctorId;
    private String symptom;
    private String diagnosis;

    public Case(String caseId, String patientId, String doctorId, String symptom, String diagnosis) {
        this.caseId = caseId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.symptom = symptom;
        this.diagnosis = diagnosis;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
