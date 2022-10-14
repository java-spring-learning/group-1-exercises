import java.io.Serializable;

public class BankAccount implements Serializable {
    private String firstName;
    private String lastName;
    private String acctNumber;
    private BankAccountType acctType;
    private double balance = 0;
    private double minimumBalance = 0;
    private double penalty = 0;
    private double transactionCharge = 0;
    private double interestCharge = 0;

    public BankAccount() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setAcctType(BankAccountType acctType) {
        this.acctType = acctType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = balance;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public void setTransactionCharge(double transactionCharge) {
        this.transactionCharge = transactionCharge;
    }

    public void setInterestCharge(double interestCharge) {
        this.interestCharge = interestCharge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public BankAccountType getAcctType() {
        return this.acctType;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double getPenalty() {
        return penalty;
    }

    public double getTransactionCharge() {
        return transactionCharge;
    }

    public double getInterestCharge() {
        return interestCharge;
    }

    public void printAccountInfo() {
        System.out.println("===============================");
        System.out.printf("Account Name: %s %s%n", firstName ,lastName);
        System.out.printf("Account Number: %s%n", acctNumber);
        System.out.printf("Account Balance: %f%n", balance);
        System.out.println("===============================");
    }

    public void printAccountInfoComplete() {
        System.out.println("===============================");
        System.out.printf("Account Name: %s %s%n", firstName ,lastName);
        System.out.printf("Account Number: %s%n", acctNumber);
        System.out.printf("Account Balance: %f%n", balance);
        System.out.printf("Account Type: %s%n", acctType.toString());
        System.out.printf("Minimum Balance: %f%n", minimumBalance);
        System.out.printf("Penalty: %f%n", penalty);
        System.out.println("===============================");
    }

    public BankAccount(String firstName, String lastName, String acctNumber, BankAccountType acctType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acctNumber = acctNumber;
        this.acctType = acctType;
    }
}
