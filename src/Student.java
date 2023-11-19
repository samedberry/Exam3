public class Student extends Person {
    protected String status;
    // The values will be one of “freshman”, “sophomore”, “junior”, or “senior”.

    public Student() {
        this.status = "freshman";
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
