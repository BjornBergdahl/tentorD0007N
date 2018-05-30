/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug16no3;

import java.util.ArrayList;

/**
 *
 * @author Björn
 */
public class Aug16no3 {
    static ListOfAccounts listOA = new ListOfAccounts();
    
    
    public static void main(String[] args)  {
        initializeAcc();
        System.out.println("Antal konton i listn: "+ listOA.getNoOfAccounts());
        System.out.println("Ta fram och visa konto nr 3 i listan:");
        System.out.println("Kontonr: "+listOA.getAccount(2).getAccNo()+" Kontonamn: "+listOA.getAccount(2).getName());
        System.out.println("Ta bort konto nr 3 ovan från listan. Skriv ut det nya kontot på den platsen");
        listOA.remove(2);
        System.out.println("Kontonr: "+listOA.getAccount(2).getAccNo()+" Kontonamn: "+listOA.getAccount(2).getName());
        System.out.println("Nytt antal objekt i listan: "+listOA.getNoOfAccounts());
    }
    
    public static void initializeAcc() {
        ArrayList<Account>tempList = listOA.getAccountList();
        for (int i=0; i<10; i++){
            Account acc = new Account();
            acc.setAccNo(""+(i+1));
            acc.setName("Kontonr"+(i+1));
            tempList.add(acc);
                        
        }
        listOA.setAccountList(tempList);
    }
}
