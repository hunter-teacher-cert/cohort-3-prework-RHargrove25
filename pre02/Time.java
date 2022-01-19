class Time{
  public static void main (String[]args){

    int hour = 20;
    int minute = 30;
    int second = 35;
    int totalMinutes = minute + (60*hour);
    int totalSeconds = second + (60*totalMinutes);
    int secondsRemaining = 86400 - totalSeconds;

    System.out.println("There has been " + totalSeconds + " seconds since midnight.");
    System.out.println("There are " + secondsRemaining + " left in the day.");
    System.out.println("This assignment took me 10 minutes");
  }
}