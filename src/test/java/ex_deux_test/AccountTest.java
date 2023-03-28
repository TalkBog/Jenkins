package ex_deux_test;

import ex_deux.Account;
import org.junit.Assert;
import org.junit.jupiter.params.provider.MethodSource;

public class AccountTest {
    @MethodSource
    public void SetGetTest(){
        Account account = new Account(0,200,10);
        Assert.assertEquals(0, account.getId());
        Assert.assertEquals(200, account.getSolde());
        Assert.assertEquals(10, account.getTaux());
        account.setTaux(15);
        Assert.assertEquals(15, account.getTaux());
    }

    @MethodSource
    public void DepotRetraitTest(){
        Account account = new Account(0,200,10);
        account.depot(100);
        Assert.assertEquals(300, account.getSolde());
        account.retrait(200);
        Assert.assertEquals(100, account.getSolde());
    }

    @MethodSource
    public void TransfertTest(){
        Account account = new Account(0,200,10);
        Account account2 = new Account(1,50,5);
        account.transfert(50,account2);
        Assert.assertEquals(100, account.getSolde());
        Assert.assertEquals(100, account2.getSolde());
    }

    @MethodSource
    public void InteretTest(){
        Account account = new Account(0,100,5);
        Assert.assertEquals(5,account.interet());
    }

}
