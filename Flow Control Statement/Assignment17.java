// Write a program to reverse a given number and print
 
import java.util.Scanner;

class Assignment17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = in.nextInt(), rev = 0, temp = n;

        while(tmp > 0) {
            rev = rev*10 + (temp%10);
            temp /= 10;
        }
        
        System.out.println(rev);
    }
}