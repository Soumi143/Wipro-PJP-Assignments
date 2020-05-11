/**
 *  Write a program to print prime numbers between 10 and 99.
 */


import java.util.Scanner;
class Assignment13
 {
    public static void main(String[] args)
   {
        for(int i=10; i<99; i++)
        {
            if(isPrime(i)) 
          {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static boolean isPrime(int n)
    {
        if(n == 0 || n == 1) return false;

        int l = (int)Math.sqrt(n);
        for(int i=2; i <= l; i++) 
     {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}