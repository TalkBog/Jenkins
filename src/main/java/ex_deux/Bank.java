package ex_deux;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }
    public List<Account> getAccounts() {
        return accounts;
    }
    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void afficherSoldes(){
        for(Account account : accounts){
            System.out.println(account.getId() + " : " + account.getSolde());
        }
    }

    public void transfert(Account account , Account account1, int montant){
        account.transfert(montant, account1);
    }
}
