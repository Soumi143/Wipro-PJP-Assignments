/* Write a program to check if a given integer number is odd or even. */


import java.util.*;
public class Assignment2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;

		System.out.print("Enter an integer number: ");
		num=sc.nextInt();
		if(num%2 ==0)
		{
			System.out.println(num +" is an even number.");
		}
		else
		{
			System.out.println(num +" is an odd number.");
		}
	}
}