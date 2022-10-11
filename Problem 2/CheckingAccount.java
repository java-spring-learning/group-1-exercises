public class CheckingAccount extends Account {
    private String acctType = "Checking Account";
    private double balance = 100.0;
    private double minimumBalance = 100.0;
    private double interestCharge = 3.0;
    private double transactionCharge = 1.0;

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
    public double getMinimumBalance() {
        return this.minimumBalance;
    }

    @Override
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public double getInterestCharge() {
        return this.interestCharge;
    }

    @Override
    public void setInterestCharge(double interestCharge) {
        this.interestCharge = interestCharge;
    }

    @Override
    public double getTransactionCharge() {
        return this.transactionCharge;
    }

    @Override
    public void setTransactionCharge(double transactionCharge) {
        this.transactionCharge = transactionCharge;
    }

    public CheckingAccount(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void displayAccountInfo(Account account) {
        super.displayAccountInfo(account);
        System.out.println("Account Type: " + account.getAcctType());
        System.out.println("Minimum Balance: " + account.getMinimumBalance());
        System.out.println("Penalty: " + account.getPenalty());
        System.out.println("Transaction Charge: " + account.getTransactionCharge());
    }
}
