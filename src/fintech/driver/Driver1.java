package academic.driver;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver1 {

    public static void main(String[] _args) {

      package fintech.driver;
import java.util.ArrayList;
import java.util.Scanner;
import fintech.model.*;

/**
 * 12S24025 Paula Gevriella Tambunan
 */
public class Driver1 {
    

    public static void main(String[] _args) {
     Scanner masukan = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        
        while (masukan.hasNext()) {
            
            String input = masukan.nextLine();
            
          
            
           
            String[] inputSegments = input.split("#");
            String command = inputSegments[0];
            String accountUsername = inputSegments[1];
            String accountName = inputSegments[2];
            
            if (command.equals("create-account")) {
                
                Account account = new Account(accountUsername, accountName);
                
                
                accounts.add(account);
                System.out.println(account.getUsername() + "|" + account.getName() + "|" + account.getBalance());
            }
            
            if (input.equals("---")) {
                break;
            }
        }
        masukan.close();
    }
}


    }

}
