package exercise2;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void depot(double montant){
        this.solde+=montant;
    }
    public void retrait(double montant){
        this.solde-=montant;
    }
}
