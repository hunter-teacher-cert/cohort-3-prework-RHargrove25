import java.util.Scanner;

class Beer{
  public static void main (String[]args){
    int beersOnTheWall;
    Scanner in = new Scanner(System.in);
    
    System.out.print("How many bottles of beer on the wall? ");
    beersOnTheWall = in.nextInt();
    song (beersOnTheWall);
  }

  public static void song (int amount){
    if (amount>0){
      System.out.println(); 
      System.out.println(amount + " bottles of beer on the wall");
      System.out.println(amount + " bottles of beer");
      System.out.println("'ya take one out, 'ya pass it around");
      amount = amount-1;
      System.out.println(amount + " bottles of beer on the wall!");
      song(amount); 
    }
    else {
      System.out.println(); 
      System.out.println("No bottles of beer on the wall");
      System.out.println("no bottles of beer,");
      System.out.println("ya’ can’t take one down, ya’ can’t pass it around");
      System.out.println("’cause there are no more bottles of beer on the wall!");
    }
  }


}  