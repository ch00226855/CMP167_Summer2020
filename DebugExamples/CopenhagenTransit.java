import java.util.Scanner;

public class CopenhagenTransit {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

   String ticketType;
   int zoneNum;

   System.out.println("Enter zone number :");
   zoneNum = scnr.nextInt();
   System.out.println("Enter adult or child :");
   ticketType = scnr.nextLine();

   if  ((zoneNum <= 2) && (ticketType == "adult"))  {
       System.out.println("The fare for adult to zone number " + zoneNum + " is 23.0.");
      }
  if  ((zoneNum <= 2) && (ticketType == "child"))  {
      System.out.println("The fare for child to zone number " + zoneNum + " is 11.5.");
      }
  if ((zoneNum == 3) && (ticketType == "adult"))  {
      System.out.println("The fare for adult to zone number " + zoneNum + " is 34.5.");
      }
  if ((zoneNum == 3) || ((zoneNum == 4)  && (ticketType == "child"))) {
      System.out.println("The fare for child to zone number " + zoneNum + " is 23.0.");
      }
  if ((zoneNum == 4) && (ticketType == "adult"))  {
      System.out.println("The fare for adult to zone number" + zoneNum + " is 46.0.");
      }
  if (zoneNum > 4) {
      System.out.println("The fare for " + ticketType + " to zone number" + zoneNum + " is -1.0.");
     }

    }
}

