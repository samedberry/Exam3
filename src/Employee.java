public abstract class Employee extends Person {
    protected String department;
    protected double salary;
    protected String dateHired;

    public Employee() {
        this.department = "test department";
        this.salary = 0.0;
        this.dateHired = "1/1/1900";
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double salary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", dateHired='" + dateHired + '\'' +
                '}';
    }
}
