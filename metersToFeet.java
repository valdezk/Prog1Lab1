
import java.util.Scanner;

public class metersToFeet
{
    	  public static void main (String[]args)
	   {
	        
	        Scanner sc = new Scanner (System.in);

             System.out.print("Enter a value in meters :");
             double    meters = sc.nextDouble();

             double feet = (meters/0.3048);

			      System.out.println(meters + " Meters is equivalent to " +
                                                feet + " feet");
          }

}
    
