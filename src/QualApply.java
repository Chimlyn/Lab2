public class QualApply {
    private String applyId;
    private String doctorId;
    private String title;
    private String status;

    public QualApply(String applyId, String doctorId, String title, String status) {
        this.applyId = applyId;
        this.doctorId = doctorId;
        this.title = title;
        this.status = status;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
