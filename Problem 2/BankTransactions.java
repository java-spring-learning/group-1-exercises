import java.util.Random;
import java.util.Scanner;


public class BankTransactions implements BankOperations{

    @Override
    public void createBankAccount() {

        System.out.println("Create a Bank Account") ;

        Scanner input = new Scanner(System.in);

        System.out.println("Input your First Name: ");
        String firstName = input.next();

        System.out.println("Input your Last Name: ");
        String lastName = input.next();

        Account account = new Account();

        account.setFirstName(firstName);
        account.setLastName(lastName);

        String acctNumber = account.setAcctNumber(String.valueOf(generateRandomAcc()));


        System.out.println("Your account has been created!");
        System.out.println("Account Name: " + firstName + " " + lastName);
        System.out.println("Account Number: " + acctNumber);

        System.out.println("\nDo you want to continue(Y/N)?: ");
        switch (input.next()) {
            case "Y", "y":
                return;
            case "N", "n":
                break;
            default:
                System.out.println("Invalid entry, goodbye!");
                break;
        }

    }

    @Override
    public void selectBankAccount() {
        System.out.println("Sorry, this feature is currently unavailable. \nPlease input again an operation to perform.") ;
    }

    private static long generateRandomAcc(){
        Random random = new Random();
        char[] digits = new char[12];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < 12; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return Long.parseLong(new String(digits));
    }
}
