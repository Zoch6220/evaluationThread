package exercise1;

public class RunnableEx1 implements Runnable {
    private int number;
    public RunnableEx1(int number){
        this.number=number;
    }
    @Override
    public void run() {
        int sum=0;
        for (int i = 1; i <= number; i++) {
            if(ISPrime(i)){
                sum+=i;
            }
        }
        System.out.println("Sum of prime numbers below " + number + " is " + sum);
    }
    public static boolean ISPrime(int number){
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
