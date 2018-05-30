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
public class ListOfAccounts {
    private ArrayList<Account> accountList = new ArrayList<>();

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    
    
    public int getNoOfAccounts(){
        int noOfAccounts;
        noOfAccounts = accountList.size();
        return noOfAccounts;
    }
    
    public Account getAccount(int index)  {
        Account acc = new Account();
        acc = accountList.get(index);
        return acc;
    }
    
    public void remove(int index)    {
        accountList.remove(index);
    }
}
