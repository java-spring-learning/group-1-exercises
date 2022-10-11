import java.util.Random;
import java.util.Scanner;


public class BankTransactions extends Account implements BankOperations{

    Scanner input = new Scanner(System.in);

    @Override
    public void createBankAccount() {

        System.out.println("Create a Bank Account") ;
        Account account = new Account();

        System.out.println("Input your First Name: ");
        account.setFirstName(input.next());

        System.out.println("Input your Last Name: ");
        account.setLastName(input.next());

        account.setAcctNumber(generateRandomAcc());

        String firstName = account.getFirstName();
        String lastName = account.getLastName();
        String acctNumber = account.getAcctNumber();

        System.out.println("Your account has been created!");
        System.out.println("Account Name: " + firstName + " " + lastName);
        System.out.println("Account Number: " + acctNumber);

        System.out.println("\nDo you want to continue(Y/N)?: ");
        switch (input.next()) {
            case "Y", "y":
                return;
            case "N", "n":
                System.exit(-1);
            default:
                System.out.println("Invalid entry, goodbye!");
                break;
        }
    }

    @Override
    public void selectBankAccount() {
 //       System.out.println("Sorry, this feature is currently unavailable. \nPlease input again an operation to perform.\n") ;
        while (true) {
        System.out.println("Choose an Account Type to Open");
        System.out.println("\n[1] Regular Account \n[2] Interest Account \n[3] Checking Account \n[-1] Exit");
        System.out.println("Enter account type: ");
        String accountType = input.next();
            switch (accountType) {
                case "1":
                    System.out.print("Enter First Name: ");
                    String firstName = input.next();
                    System.out.print("Enter Last Name: ");
                    String lastName = input.next();
                    RegularAccount regularAccount = new RegularAccount(firstName, lastName);
                    regularAccount.setAcctNumber(generateRandomAcc());
                    regularAccount.displayAccountInfo(regularAccount);
                    chooseOperation();
                    break;

                case "2":
                    System.out.print("Enter First Name: ");
                    String firstName2 = input.next();
                    System.out.print("Enter Last Name: ");
                    String lastName2 = input.next();
                    InterestAccount interestAccount = new InterestAccount(firstName2, lastName2);
                    interestAccount.setAcctNumber(generateRandomAcc());
                    interestAccount.displayAccountInfo(interestAccount);
                    chooseOperation();
                    break;

                case "3":
                    System.out.print("Enter First Name: ");
                    String firstName3 = input.next();
                    System.out.print("Enter Last Name: ");
                    String lastName3 = input.next();
                    CheckingAccount checkingAccount = new CheckingAccount(firstName3, lastName3);
                    checkingAccount.setAcctNumber(generateRandomAcc());
                    checkingAccount.displayAccountInfo(checkingAccount);
                    chooseOperation();
                    break;

                default:
                    System.out.println("Invalid entry.");
                    break;
            }

        }

    }

    private void chooseOperation() {
        System.out.println("\r\n\nChoose an Operation to Perform");
        System.out.println("\n[1] Deposit \n[2] Withdraw \n[3] Display Account Info \n[-1] Exit");
        System.out.print("Enter Transaction type: ");
        String transactionType = input.next();

        switch(transactionType) {
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
                System.out.println("Balance: " + String.format("%.2f", balance));
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
