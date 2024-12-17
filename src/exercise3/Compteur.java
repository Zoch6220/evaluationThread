package exercise3;

public class Compteur {
    private static int compteur=0;

    public static synchronized void incrementer(){
        System.out.println(Thread.currentThread().getName() + " : " + compteur);
       compteur++;
    }
    public static int getCompteur(){
        return compteur;
    }
}
