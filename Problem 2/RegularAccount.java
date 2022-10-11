import java.awt.desktop.SystemEventListener;

public class RegularAccount extends Account {
    private String acctType = "Regular Account";
    private double minimumBalance = 500.0;
    private double penalty = 10.0;
    private double balance = 500.0;

    @Override
    public String getAcctType() {
        return this.acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
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
    public double getPenalty() {
        return this.penalty;
    }

    @Override
    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public RegularAccount(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void displayAccountInfo(Account account) {
        super.displayAccountInfo(account);
        System.out.println("Account Type: " + account.getAcctType());
        System.out.println("Minimum Balance: " + account.getMinimumBalance());
        System.out.println("Penalty: " + getPenalty());
    }
}
