import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BankDatabase implements Serializable {

    List<BankAccount> bankAccounts;
    List<BankTransaction> bankTransactions;

    public List<BankTransaction> getBankTransactions() {
        return bankTransactions;
    }

    public void setBankTransactions(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public BankDatabase(List<BankAccount> bankAccounts, List<BankTransaction> bankTransactions) {
        this.bankAccounts = bankAccounts;
        this.bankTransactions = bankTransactions;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
