import java.util.Scanner;

class Assignment7
 {
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().trim().charAt(0);
        System.out.println(ch + "->" + (char)(ch^32));
      }
}