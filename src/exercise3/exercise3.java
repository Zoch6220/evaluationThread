package exercise3;

import static exercise3.Compteur.getCompteur;


public class exercise3 {
    public static void main(String[] args) {
        RunnableCompteur r1 = new RunnableCompteur();
        ThreadCompteur t1 = new ThreadCompteur();
        ThreadCompteur t2 = new ThreadCompteur();
        Thread t3 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        // Affichage de la valeur finale du compteur
        System.out.println("Valeur finale du compteur : " + getCompteur());
    }
}

