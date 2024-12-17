package exercise2;

public class exercise2 {
    public static void main(String[] args) {
        CompteBancaire compteBancaire=new CompteBancaire(1000);
        RunnableDepot runnableDepot=new RunnableDepot(compteBancaire);
        RunnableRetrait runnableRetrait=new RunnableRetrait(compteBancaire);

        for(int i=0;i<10;i++){

            Thread depot=new Thread(runnableDepot);
           // depot.setPriority(Thread.MAX_PRIORITY);
            Thread retrait=new Thread(runnableRetrait);
          //  retrait.setPriority(Thread.MIN_PRIORITY);

            depot.start();
             try {
                Thread.sleep(randomWait());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            retrait.start();

        }

    }
    private static int randomWait(){
        return ((int)(Math.random()*3))*1000;
    }
}
