package exercise2;

public class RunnableDepot implements Runnable {
    private final CompteBancaire compte;
    private static int compteur=1;
    public RunnableDepot(CompteBancaire compte){
        this.compte=compte;

    }
    @Override
    public void run() {
        try {
            double ancientSolde= compte.getSolde();
            double montant=createMontantRandom();
            montant = Math.round(montant * 100.0) / 100.0;
            depot(montant);
            System.out.println("\nCompteur: "+compteur+"\nAncien solde:"+ancientSolde+" \nDépot de: "+montant+" "+ "\nSolde en compte: "+ compte.getSolde());
            compteur++;
        } catch (ExceptionMontantNegative e){
            System.out.println("Compteur: "+compteur+"\n"+e.getMessage());
        }


    }
    private double createMontantRandom(){
        double montant=1+(Math.random()*(1000-1));
        return  Math.round(montant * 100.0) / 100.0;
    }

    private void depot(double montant) throws ExceptionMontantNegative {
        compte.depot(montant);
    }
}
