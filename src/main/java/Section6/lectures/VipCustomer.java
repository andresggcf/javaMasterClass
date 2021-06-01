package Section6.lectures;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Object Generated");
    }

    public VipCustomer(String name, String email) {
        this(name, 5002.2, email);
    }

    public VipCustomer () {
        this("Andres",
                12312.1,
                "default@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
