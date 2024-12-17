package exercise2;

public class RunnableRetrait implements Runnable {
    private final CompteBancaire compte;
    private static int compteur=1;
    public RunnableRetrait(CompteBancaire compte){
        this.compte=compte;
    }
    @Override
    public void run() {
        try {
            double ancientSolde= compte.getSolde();
            double montant=createMontantRandom();
            montant = Math.round(montant * 100.0) / 100.0;
            retrait(montant);

            System.out.println("\nCompteur: "+compteur+"\nAncien solde:"+ancientSolde+" \nRetrait de: "+montant+" "+ "\nSolde en compte: "+ compte.getSolde());

            compteur++;
        } catch (ExceptionRetrait e){
            System.out.println("Compteur: "+compteur+"\n"+e.getMessage());
        }
    }
    private double createMontantRandom(){
        double montant=1+(Math.random()*(1000-1));
        return  Math.round(montant * 100.0) / 100.0;
    }

    private void retrait(double montant) throws ExceptionRetrait {
        compte.retrait(montant);
    }


}
