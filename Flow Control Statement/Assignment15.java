 //Write a program to add all the values in a given number and print. Ex: 1234->10

import java.util.Scanner;
class Assignment15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your desired number: ");
        int n = scan.nextInt();

        int temp = n, sum = 0;

        while(n > 0) {
            sum += n%10;
            n /= 10;
        }

        System.out.println(temp + "->" + sum);
    }
}