public class JuniorDoctor extends User {
    private String department;

    public JuniorDoctor(String id, String name, String phone, String department) {
        super(id, name, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
