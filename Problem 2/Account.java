import java.util.Random;

public class Account {
    public String firstName;
    public String lastName;
    public String acctNumber;
    public String acctType;
    public double balance;
    public double minimumBalance;
    public double penalty;
    public double transactionCharge;
    public double interestCharge;

   public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void setAcctType(String acctType) {
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

    public String getAcctType() {
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

    public void displayAccountInfo(Account account) {
        System.out.println("===============================");
        System.out.println("Account Name: " + account.getFirstName() + " " + account.getLastName());
        System.out.println("Account Number: " + account.getAcctNumber());
        System.out.println("Account Balance: " + account.getBalance());
    }

    Account() {

    }
    public static String generateRandomAcc(){
        Random random = new Random();
        char[] digits = new char[12];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < 12; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return String.valueOf(digits);
    }
}
