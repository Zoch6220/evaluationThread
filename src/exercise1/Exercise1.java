package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws ExceptionNombreInvalid {
        int num;
        boolean done=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the prime number calculator");
        System.out.println("------------------------------------");
        do{
            System.out.println("Enter a number : ");
            try{
                num=sc.nextInt();
                if(num<0){
                    throw new ExceptionNombreInvalid("Number must be positive");
                }
                RunnableEx1 runnableEx1=new RunnableEx1(num);
                Thread thread=new Thread(runnableEx1);
                thread.start();
                done=true;
            }catch(NumberFormatException e){
                System.out.println("Entré non valide, dois etre un chiffre entier : " + e);
            }catch (InputMismatchException e){
                System.out.println("Dois etre un chiffre entier :"+e);
            }finally {
                sc.next();
            }
        }while(!done);



    }

}
class ExceptionNombreInvalid extends Exception{
    public ExceptionNombreInvalid(String message){
        super(message);
    }
}