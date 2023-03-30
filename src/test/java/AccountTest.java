import ex_deux.Account;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class AccountTest {
    @Test
    void SetGetTest(){
        Account account = new Account(0,200,10);
        Assertions.assertEquals(0, account.getId());
        Assertions.assertEquals(200, account.getSolde());
        Assertions.assertEquals(10, account.getTaux());
        account.setTaux(15);
        Assertions.assertEquals(15, account.getTaux());
    }

    @Test
    void DepotRetraitTest(){
        Account account = new Account(0,200,10);
        account.depot(100);
        Assertions.assertEquals(300, account.getSolde());
        account.retrait(200);
        Assertions.assertEquals(100, account.getSolde());
    }

    @Test
    void TransfertTest(){
        Account account = new Account(0,200,10);
        Account account2 = new Account(1,50,5);
        account.transfert(50,account2);
        Assertions.assertEquals(150, account.getSolde());
        Assertions.assertEquals(100, account2.getSolde());
    }

    @Test
    void InteretTest(){
        Account account = new Account(0,100,10);
        Assertions.assertEquals(10,account.interet());
    }

}
