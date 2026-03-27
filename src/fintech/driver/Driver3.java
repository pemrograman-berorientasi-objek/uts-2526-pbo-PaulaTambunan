package academic.driver;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver3 {

    public static void main(String[] _args) {

package fintech.driver;
import java.util.ArrayList;
import java.util.Scanner;
import fintech.model.*;

/**
 * 12S24025 Paula Gevriella Tambunan
 */
public class Driver3 {

    public static void main(String[] _args) {
    
    Scanner masukan = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        ArrayList<Transaction> transactions = new ArrayList<>();

        while (masukan.hasNext()) {
            String input = masukan.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] inputArr = input.split("#");
            String command = inputArr[0];

            if (command.equals("create-account")) {
                String Username = inputArr[1];
                String accountName = inputArr[2];
                Account account = new Account(Username, accountName);
                accounts.add( account);
                System.out.println(account.getName() + "|" + account.getUsername() + "|" + account.getBalance());
            } else if (command.equals("find-account")) {
                String accountName = inputArr[1];
                String searchKey = accountName.toLowerCase();
                for (Account account : accounts) {
                    if (account.getName().toLowerCase().equals(searchKey)) {
                        System.out.println(account.getName() + "|" + account.getUsername() + "|" + account.getBalance());
                        break;
                    }
                }
            } else if (command.equals("create-transaction")) {
                String accountName = inputArr[1];
                double amount = Double.parseDouble(inputArr[2]);
                String posted_at = inputArr[3];
                String note = inputArr[4];
                String searchKey = accountName.toLowerCase();
                for (Account account : accounts) {
                if (account.getName().toLowerCase().equals(searchKey)) {
                      account.getBalance(amount);
                      Transaction transaction = new transaction(accountName, amount, posted_at, note);
                      transactions.add(transaction);
                      break;
                  }
                }
            }
        }
        masukan.close();
    }
}       



    }

}
