package Task8.Task8_1;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private LocalDate birtDate;
    private Address address;

    public User(String firstName, String lastName, LocalDate birtDate, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDate = birtDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtDate=" + birtDate +
                ", address=" + address +
                '}';
    }
}
