import java.util.Scanner;

class Celsius{
  public static void main (String[]args){
    double cel;
    double far;
    final double mult = 1.8;
    final double add = 32.0;
    Scanner in = new Scanner(System.in);
    

    System.out.print("What is the temperature in Celsius? ");
    cel = in.nextDouble();
    far = cel * mult + add;
    System.out.println ("It is " + far + " degrees Farenheit.");

  }
}