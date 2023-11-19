public class Faculty extends Employee {
    protected String officeHours;
    protected String rank;
    // rank (junior, senior) as fields


    public Faculty() {
        this.officeHours = "no office hours";
        this.rank = "junior";
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department, double salary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", dateHired='" + dateHired + '\'' +
                ", officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
