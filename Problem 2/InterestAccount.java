public class InterestAccount extends Account {
    private String acctType = "Interest Account";
    private double balance = 0.0;
    private double interestCharge = 3.0;

    @Override
    public String getAcctType() {
        return this.acctType;
    }

    @Override
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getInterestCharge() {
        return this.interestCharge;
    }

    public void setInterestCharge(double interestCharge) {
        this.interestCharge = interestCharge;
    }

    public InterestAccount(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void displayAccountInfo(Account account) {
        super.displayAccountInfo(account);
        System.out.println("Account Type: " + account.getAcctType());
        System.out.println("Interest Charge: " + account.getInterestCharge());
    }
}
