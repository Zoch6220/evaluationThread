package exercise2;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }
    public double getSolde() {
        return Math.round(solde*100.0)/100.0;
    }


    public void depot(double montant) throws ExceptionMontantNegative {
        if(montant>0){
            synchronized (this){
                this.solde+=montant;
            }

        }else{
            throw new ExceptionMontantNegative("Le montant du depot dois etre positif");
        }

    }
    public void retrait(double montant) throws ExceptionRetrait {
        if(montant>0){
            synchronized (this){
                if(this.solde>=montant){
                    this.solde-=montant;
                }else{
                    throw new ExceptionRetrait("Le retrait est plus grand que le solde du compte");
                }
            }
        }else {throw new ExceptionRetrait("Le montant du retrait dois etre positif");}

    }
}

