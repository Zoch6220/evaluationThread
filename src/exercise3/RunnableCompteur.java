package exercise3;

public class RunnableCompteur implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Compteur.incrementer();
        }
    }
}
