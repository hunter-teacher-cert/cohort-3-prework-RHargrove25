class Date{
  public static void main(String[]args){

    String day = "Tuesday";
    int date = 25;
    String month = "March";
    int year = 1977;

    System.out.println("American Format:");
    System.out.print (day);
    System.out.print (", ");
    System.out.print (month);
    System.out.print (" ");
    System.out.print (date);
    System.out.print (", ");
    System.out.println(year);

    System.out.println("European Format:");
    System.out.println (day + " " + date + " " + month+ " " + year);
  }
}