import java.util.Scanner;


public class Group1Bank implements BankOperation {

    Scanner input = new Scanner(System.in);

    @Override
    public BankAccount createBankAccount() {

        System.out.println("===============================");
        System.out.println("Create a Bank Account");
        BankAccount bankAccount = new BankAccount();

        System.out.print("Input your First Name: ");
        bankAccount.setFirstName(input.next());

        System.out.print("Input your Last Name: ");
        bankAccount.setLastName(input.next());

        bankAccount.setAcctType(chooseBankAccountType());

        bankAccount.setAcctNumber(BankUtils.generateRandomAcc());
        System.out.println("===============================");
        boolean result = BankUtils.createBankAccount(bankAccount);
        if (result) {
            return bankAccount;
        } else {
            return null;
        }

    }

    @Override
    public BankAccount selectBankAccount() {
        boolean keepLooping = true;
        BankAccount bankAccount = null;
        while (keepLooping) {
            BankAccountType bankAccountType = chooseBankAccountType();
            System.out.println("===============================");
            System.out.print("Enter Account Name: ");
            String accountName = input.next();
            bankAccount = BankUtils.getBankAccount(accountName, bankAccountType);
            if (bankAccount != null) {
                bankAccount.printAccountInfoComplete();
                keepLooping = false;
            } else {
                System.out.print("Bank Account not found!");
            }
        }


//        System.out.print("Enter First Name: ");
//        String firstName = input.next();
//        System.out.print("Enter Last Name: ");
//        String lastName = input.next();
//        RegularBankAccount regularBankAccount = new RegularBankAccount(firstName, lastName);
//        regularBankAccount.setAcctNumber(BankUtils.generateRandomAcc());
//        regularBankAccount.printAccountInfo(regularBankAccount);
//        chooseOperation();
        return bankAccount;

    }

    public BankAccountType chooseBankAccountType() {
        BankAccountType bankAccountType = null;
        System.out.println("===============================");
        System.out.println("Choose an Account Type to Open");
        System.out.println("\n[1] Regular Account \n[2] Interest Account \n[3] Checking Account");
        boolean bankAccountTypeIsValid = false;
        do {
            System.out.print("Enter Account Type: ");
            int accountType = input.nextInt();
            switch (accountType) {
                case 1:
                    bankAccountType = BankAccountType.REGULAR;
                    bankAccountTypeIsValid = true;
                    break;
                case 2:
                    bankAccountType = BankAccountType.INTEREST;
                    bankAccountTypeIsValid = true;
                    break;

                case 3:
                    bankAccountType = BankAccountType.CHECKING;
                    bankAccountTypeIsValid = true;
                    break;
                default:
                    System.out.println("Invalid entry. Please try again.");
                    break;
            }
        } while (!bankAccountTypeIsValid);

        return bankAccountType;
    }

    private void chooseOperation() {
        System.out.println("\r\n\nChoose an Operation to Perform");
        System.out.println("\n[1] Deposit \n[2] Withdraw \n[3] Display Account Info \n[-1] Exit");
        System.out.print("Enter Transaction type: ");
        String transactionType = input.next();

        switch (transactionType) {
            case "1":
                System.out.print("\r\nEnter Amount to Deposit: ");
                double amountDep = input.nextInt();
                deposit(amountDep);
                break;
            case "2":
                System.out.print("\r\nEnter Amount to Withdraw: ");
                double amountTran = input.nextInt();
                withdraw(amountTran);
                break;
            case "3":
                System.out.println("Balance: ");
                System.out.println("Account Type: Regular Account");
                break;

            case "-1":
                System.out.println("End of Transaction");
                System.exit(-1);

            default:
                System.out.println("Invalid entry!");
                break;
        }
    }

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

}
