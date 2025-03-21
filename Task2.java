import java.util.Random;
import java.util.Scanner;
public class Task2 {
    public void guessingGame(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
//        Random Number between 1 - 10000000
        int number = random.nextInt(10000000)+1;
        int guess;
        int numberOfGuesses=0;
        do{
            System.out.print("Enter the Guess number here : ");
            guess = sc.nextInt();
            int diff = Math.abs(guess-number);
            if(guess>number){
                if(diff<50){
                    System.out.println("Your Guess number is high. Almost there.");
                }
                else {
                    System.out.println("Your Guess number is too high.");
                }
            }
            else if(guess<number){
                if(diff<50){
                    System.out.println("Your Guess number is low. Almost there.");
                }
                else {
                    System.out.println("Your Guess number is too low.");
                }
            }
            numberOfGuesses++;
        }while(guess!=number);
        System.out.println("---------------------------------------------");
        System.out.println("|\tCONGRATULATIONS!\t\t\t\t\t \t|");
        System.out.println("|\tYour score is : "+numberOfGuesses+"\t\t\t \t\t\t|");
        System.out.println("|\tGuess number is : "+number+"\t\t\t\t|");
        System.out.println("---------------------------------------------");
        sc.close();
    }
    public static void main(String[] args){
        Task2 task= new Task2();
        task.guessingGame();

    }
}
