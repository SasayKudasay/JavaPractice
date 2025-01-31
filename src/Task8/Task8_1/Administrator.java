package Task8.Task8_1;

import java.time.LocalDate;

public class Administrator extends User{
    private String department;
    private LocalDate hireDate;

    public Administrator(String firstName, String lastName, LocalDate birtDate, Address address, String department, LocalDate hireDate) {
        super(firstName, lastName, birtDate, address);
        this.department = department;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "department='" + department + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
