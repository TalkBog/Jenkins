package ex_deux;

public class Account {
    private int id;
    private int solde;
    private int taux;

    public Account(int id, int solde, int taux) {
        this.id = id;
        this.solde = solde;
        this.taux = taux;
    }

    public int getId() {
        return id;
    }
    public int getSolde() {
        return solde;
    }
    public int getTaux() {
        return taux;
    }
    public void setTaux(int taux) {
        this.taux = taux;
    }

    public void retrait(int montant){
        solde -= montant;
    }
    public void depot(int montant){
        solde += montant;
    }
    public void transfert(int montant, Account account){
        retrait(montant);
        account.depot(montant);
    }
    public double interet(){
        return (solde * ((double)taux/100));
    }
}