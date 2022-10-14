import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class BankUtils {

    public static String generateRandomAcc() {
        Random random = new Random();
        char[] digits = new char[12];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < 12; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return String.valueOf(digits);
    }


    public static BankAccount getBankAccount(String name, BankAccountType type) {
        BankDatabase bankDatabase = getBankDatabase();
        if(bankDatabase!=null){
            for(BankAccount ba: bankDatabase.bankAccounts){
                String fullName = String.format("%s %s",ba.getFirstName(), ba.getLastName());
                if(fullName.equalsIgnoreCase(name) && ba.getAcctType().equals(type)){
                    return ba;
                }
            }
        }
        return null;
    }

    public static boolean createBankAccount(BankAccount account) {
        BankDatabase bankDatabase = getBankDatabase();
        if(bankDatabase!=null){
            boolean accountAlreadyExists = false;
            for(BankAccount bankAccount: bankDatabase.bankAccounts){
                String fullName = String.format("%s %s",bankAccount.getFirstName(), bankAccount.getLastName());
                String fullNameForCreation = String.format("%s %s",account.getFirstName(), account.getLastName());
                if(fullName.equalsIgnoreCase(fullNameForCreation) && account.getAcctType().equals(bankAccount.getAcctType())){
                    accountAlreadyExists = true;
                }
            }
            if(accountAlreadyExists){
                System.out.println("Account Name already taken!");
                return false;
            }else{
                bankDatabase.bankAccounts.add(account);
            }
        }else{
            bankDatabase = new BankDatabase(new ArrayList<BankAccount>(),new ArrayList<BankTransaction>());
            bankDatabase.bankAccounts.add(account);
        }
        try{
            FileOutputStream fos = new FileOutputStream("group1bank.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bankDatabase);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public static BankDatabase getBankDatabase(){
        BankDatabase bankDatabase = null;
        try {
            FileInputStream fis = new FileInputStream("group1bank.dat");
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            Object obj;
            do{
                obj = inputStream.readObject();
                if(obj != null){
                    if (obj instanceof BankDatabase) {
                        bankDatabase = (BankDatabase) obj;
                    }
                }
            }while(inputStream.available() > 0);
            inputStream.close();
        } catch(IOException | ClassNotFoundException exception){
            System.out.println("Something went wrong in the database.");
        }
        return bankDatabase;
    }
}
