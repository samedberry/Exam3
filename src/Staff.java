public class Staff extends Employee {
    protected String title;

    public Staff() {
        this.title = "test title";
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String department, double salary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, department, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", dateHired='" + dateHired + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
