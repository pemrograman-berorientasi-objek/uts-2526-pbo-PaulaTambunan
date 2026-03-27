package academic.driver;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver2 {

    public static void main(String[] _args) {

      package fintech.driver;
import java.util.*;
import fintech.model.*;

/**
 * 12S24025 Paula Gevriella Tambunan
 */
public class Driver2 { 

    public static void main(String[] _args) {

        Scanner masukan = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        ArrayList<Transaction> Transaction  = new ArrayList<>();

        String[] inputArr = input.split("#");
        String command = inputArr[1];

            if (command.equals("DepositTransaction")) {
                String amount =inputArr[2];
                String timestamp = inputArr[3];
                String description = inputArr[4];
                String id = inputArr[1];
                DepositTransaction deposit = new DepositTransaction(amount, timestamp, description, id);
                Transaction.add(deposit);
                System.out.println(accounts.getUsername() + "|" + transactions.getamount() + "|" + accounts.getBalance());

            } else if (command.equals("find-account")) {
                String accountName = inputArr[1];
                String searchKey = accountName.toLowerCase();
                for (Account account : accounts) {
                    if (account.getUsername().toLowerCase().equals(searchKey)) {
                        System.out.println(account.getUsername() + "|" + account.getName() + "|" + account.getBalance());

                    }

            String[] input = input.split("#");
            String commands = inputArr[0];

            if (command.equals("create-account")) {
                String Username = inputArr[1];
                String Name = inputArr[2];
                Account accountss = new Account(Username, accountName);
                accounts.add(account);
                System.out.println(account.getUsername() + "|" + account.getName() + "|" + account.getBalance());
            } else if (command.equals("find-account")) {
                String Name = inputArr[1];
                String searchKeys = accountName.toLowerCase();
                for (Account accountss : accounts) {
                    if (account.getUsername().toLowerCase().equals(searchKey)) {
                        System.out.println(account.getUsername() + "|" + account.getName() + "|" + account.getBalance());
                    }
                    
                    while (masukan.hasNext()) {
            String inputs = masukan.nextLine();
            if (input.equals("---")) {
                break;
            }
                }
            }
        }
        masukan.close();
    }
        

}

    }}

    
    

    }

}
