package jp.co.sss;

public class Employee {

    private String firstName;
    private String lastName;

    public Employee() {
        this.firstName = "デフォルト";
        this.lastName = "太郎";
    }

    public Employee(final String pFirstName, final String pLastName) {
        this.firstName = pFirstName;
        this.lastName = pLastName;
    }

    public String getName() {
        return this.firstName + this.lastName;
    }
}
