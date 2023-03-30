import ex_deux.Account;
import ex_deux.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BankTest {

    @Test
    void AddTest(){
        Bank bank = new Bank();
        Assertions.assertEquals(0,bank.getAccounts().size());
        Account account = new Account(0,200,10);
        bank.addAccount(account);
        Assertions.assertEquals(1,bank.getAccounts().size());
    }

    @Test
    void RemoveTest(){
        Bank bank = new Bank();
        Account account = new Account(0,200,10);
        bank.addAccount(account);
        bank.removeAccount(account);
        Assertions.assertEquals(0,bank.getAccounts().size());
    }

    @Test
    void TransfertTest(){
        Bank bank = new Bank();
        Account account = new Account(0,200,10);
        Account account2 = new Account(0,500,5);
        bank.addAccount(account);
        bank.addAccount(account2);
        bank.transfert(account,account2,100);
        Assertions.assertEquals(100,account.getSolde());
        Assertions.assertEquals(600,account2.getSolde());
    }
}
