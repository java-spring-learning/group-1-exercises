import java.io.Serializable;

public class BankTransaction implements Serializable {

    BankTransactionType bankTransactionType;
    double transactionAmount;

    private String acctNumber;

    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public BankTransaction(BankTransactionType bankTransactionType, double transactionAmount, String acctNumber) {
        this.bankTransactionType = bankTransactionType;
        this.transactionAmount = transactionAmount;
        this.acctNumber = acctNumber;
    }

    public BankTransactionType getBankTransactionType() {
        return bankTransactionType;
    }

    public void setBankTransactionType(BankTransactionType bankTransactionType) {
        this.bankTransactionType = bankTransactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
