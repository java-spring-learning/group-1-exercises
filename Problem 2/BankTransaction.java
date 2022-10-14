import java.io.Serializable;

public class BankTransaction implements Serializable {

    BankTransactionType bankTransactionType;
    double transactionAmount;

    public BankTransaction(BankTransactionType bankTransactionType, double transactionAmount) {
        this.bankTransactionType = bankTransactionType;
        this.transactionAmount = transactionAmount;
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
