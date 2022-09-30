
// package rahul.company;
import java.util.Scanner;

public class First_code {

  public static void main(String args[]) {

    Scanner Taking = new Scanner(System.in);

    // Finding Area of circle:----->

    /*
     * float PI= 3.14f;
     * 
     * System.out.println("Enter the radius:: ");
     * int r=inputScanner.nextInt();
     * 
     * double areaofcircle= (PI *r*r);
     * 
     * System.out.println(areaofcircle);
     */

    // Calculating CBSE Exam percentage:----->

    /*
     * System.out.println("Enter Subject 1 marks:: ");
     * byte science = Taking.nextByte();
     * System.out.println("Enter Subject 2 marks:: ");
     * byte Math= Taking.nextByte();
     * System.out.println("Enter Subject 3 marks:: ");
     * byte English = Taking.nextByte();
     * System.out.println("Enter Subject 4 marks:: ");
     * byte Hindi = Taking.nextByte();
     * System.out.println("Enter Subject 5 marks:: ");
     * byte socialscience = Taking.nextByte();
     * int fullmarks = 500;
     * 
     * double marks = (science + Math + Hindi + English + socialscience);
     * double percentage = (marks/fullmarks)*100 ;
     * 
     * System.out.println(percentage);
     * 
     * 
     * 
     * System.out.println(" Total marks obtain ::"+ marks);
     * System.out.println(" Percentage obtain ::"+ percentage);
     * 
     * 
     */

    // Checking input is given by user is integer or not.

    System.out.println("Enter the first number: ");
    int x = Taking.nextInt();

    System.out.println("Enter the second number: ");

    int y = Taking.nextInt();

    double Divide = x / y;

    System.out.println(x + "*" + y + "=" + Divide);

    Taking.close();
  }
}
