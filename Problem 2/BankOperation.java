public interface BankOperation {
    BankAccount createBankAccount();
    BankAccount selectBankAccount();

    void chooseOperation(BankAccount bankAccount);
}
