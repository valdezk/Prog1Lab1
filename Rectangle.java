import java.util.Scanner;

public class Rectangle
{
    public static void main(String args[])
        {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of Rectangle");
		int length = sc.nextInt();

		System.out.println("Enter width of Rectangle");
		int width = sc.nextInt();

		int area = length * width;

		int perimeter = 2 * (length + width);

		System.out.println("Area of Rectangle : " + area);

		System.out.println("Rectangle of Rectangle : " + perimeter);
	}

}
