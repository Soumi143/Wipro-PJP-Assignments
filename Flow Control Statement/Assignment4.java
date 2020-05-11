// Initialize two character variables in a program and display the characters in alphabetical order.



import java.util.Scanner;

public class Assignment4
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner ( System .in);

		System.out.println("Enter the first character :");
		char ch1=s.next().charAt(0);

		System.out.println("enter the second character");
		char ch2=s.next().charAt(0);

	if (ch1>ch2)
		System.out.println(ch2+" , "+ch1);

	else
		System.out.println(ch1+" , "+ch2);
	}
}