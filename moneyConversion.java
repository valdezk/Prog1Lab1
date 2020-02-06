import java.util.Scanner;

public class moneyConversion
{
	public static void main(String []args)

	{
	        Scanner sc = new Scanner (System.in);


			System.out.print("Enter a value in CAD: ");

			double moneyCAD = sc.nextDouble();

			double moneyEUR = (moneyCAD*0.685486);

			double moneyUSD = (moneyCAD*0.752409);

			System.out.println("Value of CAD in EUR: " + moneyEUR + " EUR " );
			System.out.println("Value of CAD in USD: " + moneyUSD + " USD " );








	}
}
