import java.util.Scanner;
import java.util.Random;

class Guess{
  public static void main (String[]args){

    Random random = new Random();
    Scanner in = new Scanner(System.in);

    int randomNumber = random.nextInt(100)+1;
    int userGuess;
    int diff;
    
    System.out.print("Guess a number between 1 and 100: ");
    userGuess = in.nextInt();
    System.out.println("I was thinking of " + randomNumber);
    diff = Math.abs(randomNumber - userGuess);
    System.out.println("You were off by "+ diff);
    
  }
}