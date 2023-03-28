package ex_deux_test;

import ex_deux.Account;
import ex_deux.Bank;
import org.junit.Assert;
import org.junit.jupiter.params.provider.MethodSource;

public class BankTest {

    @MethodSource
    public void AddTest(){
        Bank bank = new Bank();
        Assert.assertEquals(0,bank.getAccounts().size());
        Account account = new Account(0,200,10);
        bank.addAccount(account);
        Assert.assertEquals(1,bank.getAccounts().size());
    }

    @MethodSource
    public void RemoveTest(){
        Bank bank = new Bank();
        Account account = new Account(0,200,10);
        bank.addAccount(account);
        bank.removeAccount(account);
        Assert.assertEquals(0,bank.getAccounts().size());
    }

    @MethodSource
    public void TransfertTest(){
        Bank bank = new Bank();
        Account account = new Account(0,200,10);
        Account account2 = new Account(0,500,5);
        bank.addAccount(account);
        bank.addAccount(account2);
        bank.transfert(account,account2,100);
        Assert.assertEquals(100,account.getSolde());
        Assert.assertEquals(600,account2.getSolde());
    }
}
