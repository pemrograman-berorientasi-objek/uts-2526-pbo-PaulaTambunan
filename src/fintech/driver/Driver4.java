package fintech.driver;
import java.util.ArrayList;
import java.util.Scanner;

import fintech.model.Account;
import fintech.model.Transaction;

/**
 * 12S24025 Paula Gevriella Tambunan
 */
public class Driver4 {

    public static void main(String[] _args) {
    Scanner masukan = new Scanner(System.in);
        ArrayList<Transaction> Transaction = new ArrayList<>();

for (int i = 0; i < Transaction.size(); i++) {
            for (int j = i + 1; j < Transaction.size(); j++){
                Transaction trac;
                String posted1 = ((Object) Transaction.get(i)).getposted1();
                String posted2 = Transaction.get(j).getposted2();
                String[] tempPost1 = posted1.split(" ");
                String[] tempPost2 = posted2.split(" ");
                
               
                String[] tmpTgl1 = tempPost1[0].split("/");
                int Thn1 = Integer.parseInt(tmpTgl1[0]);
                int Bln1 = Integer.parseInt(tmpTgl1[1]);
                int Tgl1 = Integer.parseInt(tmpTgl1[2]);
                
                String[] waktu1 = tempPost1[1].split(":");
                int jam1 = Integer.parseInt(waktu1[0]);
                int menit1 = Integer.parseInt(waktu1[1]);
                int detik1 = Integer.parseInt(waktu1[2]);

                String[] tmpTgl2 = tempPost2[0].split("/");
                int Thn2 = Integer.parseInt(tmpTgl2[0]);
                int Bln2 = Integer.parseInt(tmpTgl2[1]);
                int Tgl2 = Integer.parseInt(tmpTgl2[2]);
                
                String[] waktu2 = tempPost2[1].split(":");
                int jam2 = Integer.parseInt(waktu2[0]);
                int menit2 = Integer.parseInt(waktu2[1]);
                int detik2 = Integer.parseInt(waktu2[2]);

                
                if((Thn1 > Thn2) && (Bln1 > Bln2) && (Tgl1 > Tgl2)){
                    trac = Transaction.get(i);
                   
                } else if ((Thn1 == Thn2) && (Bln1 == Bln2) && (Tgl1 == Tgl2)){
                    if ((jam1 < jam2) && (menit1 < menit2) && (detik1 < detik2));
                }

            }
        }



        for(Transaction transaction : Transaction){
            System.out.println(transaction.toString());
        }

        scan.close();
        
    }


}

    
