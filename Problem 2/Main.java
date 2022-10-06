import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankTransactions bankClient = new BankTransactions();

        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("**************************");
            System.out.println("Welcome to Group 1 Bank");
            System.out.println("\nChoose an Operation to Perform:");
            System.out.println("\n[1] Create a bank account \n[2] Select a bank account");

            int input = scan.nextInt();
            switch (input) {
                case 1:
                    bankClient.createBankAccount();
                    continue;
                case 2:
                    bankClient.selectBankAccount();
                    continue;
                default:
                    System.out.println("Invalid entry, please try again");
                    break;
            }break;
        }
    }
}