import java.util.Random;
import java.util.Scanner;

public class BankTransactions implements BankOperations{

    @Override
    public void createBankAccount() {

        System.out.println("Create a Bank Account") ;

        Scanner firstName = new Scanner(System.in);
        String fName = "";
        System.out.println("Input your First Name: ");

        fName = firstName.nextLine();

        Scanner lastName = new Scanner(System.in);
        String lName = "";
        System.out.println("Input your Last Name: ");

        lName = lastName.nextLine();

        Account account = new Account();

        account.setFirstName(fName);
        account.setLastName(lName);
        account.setAcctNumber(String.format("%06d",generateRandomAcc()));


        System.out.println("Your account has been created!");
//        System.out.println("Account Name: " + firstName + " " + lastName);
        System.out.println("Account Number: ");




        Scanner scan = new Scanner(System.in);
        String input = "";

        System.out.println("Do you want to continue(Y/N)?: ");
        input = String.valueOf(scan.nextInt());
        switch (input) {
            case "Y", "y":
              return;
            case "N", "n":
              break;
        }

    }

    @Override
    public void selectBankAccount() {
        System.out.println("Sorry, this feature is currently unavailable. \nPlease input again an operation to perform.") ;
    }

    private static int generateRandomAcc(){
        Random accountRandom = new Random();
        return accountRandom.nextInt(99999999);
    }
}
