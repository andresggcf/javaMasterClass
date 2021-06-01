package Section6.lectures;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount (int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with parameters called");
    }

    public BankAccount () {
        this(1234567890,
                0,
                "Jon Doe",
                "default@email.com",
                5550123);
        System.out.println("Empty constructor called");

    }

    public int getAccountNumberNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (double amount) {
        double accountBalance = this.balance;
        System.out.println("Your current balance is: $" + accountBalance);
        this.balance += amount;
        System.out.println("After deposit of $" + amount +
                ", your new balance is $" + this.balance);

    }

    public void withdrawFunds (double amount) {
        double accountBalance = this.balance;
        if (amount > accountBalance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Your current balance is: $" + accountBalance);
            this.balance -= amount;
            System.out.println("After withdraw of $" + amount +
                    ", your new balance is $" + this.balance);
        }
    }
}
