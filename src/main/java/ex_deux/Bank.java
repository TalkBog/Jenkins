package ex_deux;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Bank {
    private static final Logger logger = LogManager.getLogger(Bank.class);
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
            logger.info(account.getId() + " : " + account.getSolde());
        }
    }

    public void transfert(Account account , Account account1, int montant){
        account.transfert(montant, account1);
    }
}
