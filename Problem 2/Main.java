import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("===============================");
            System.out.println("Welcome to Group 1 Bank");
            System.out.println("\nChoose an Operation to Perform:");
            System.out.println("\n[1] Create a bank account \n[2] Select a bank account");
            System.out.print("\nEnter operation: ");

            int input = scan.nextInt();
            switch (input) {
                case 1:
                    initCreateBankAccount();
                    break;
                case 2:
                    initSelectBankAccount();
                    break;
                default:
                    System.out.println("===============================");
                    System.out.println("Invalid entry, please try again.");
                    System.out.println("===============================");
                    break;
            }
        }
    }

    public static void initCreateBankAccount() {
        BankOperation bankOperation = new Group1Bank();
        do {
            BankAccount bankAccount = bankOperation.createBankAccount();
            if (bankAccount!=null) {
                System.out.println("Your account has been created!");
                bankAccount.printAccountInfo();
            } else {
                System.out.println("ERROR: Failed to create an account");
            }
        } while (askIfContinue());
    }

    public static void initSelectBankAccount() {
        BankOperation bankOperation = new Group1Bank();
        do {
            BankAccount bankAccount = bankOperation.selectBankAccount();
            if (bankAccount!=null) {
                System.out.println("Your account has been selected!");
                bankAccount.printAccountInfo();
            } else {
                System.out.println("ERROR: Failed to select account");
            }
        } while (askIfContinue());
    }

    public static boolean askIfContinue() {
        while (true) {
            System.out.println("===============================");
            System.out.println("\nDo you want to continue(Y/N)?: ");
            String input = new Scanner(System.in).next();
            switch (input) {
                case "Y", "y":
                    return true;
                case "N", "n":
                    return false;
                default:
                    System.out.println("Invalid entry, please input only Y or N");
                    break;
            }
        }
    }
}