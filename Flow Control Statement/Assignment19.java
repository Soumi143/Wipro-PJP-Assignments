// Write a program to print first 5 values which are divisible by 2, 3, and 5.


class Assignment19 {
    public static void main(String[] args) {
        int c = 0, n = 0;

        while(c < 5 ) {
            //if(n%2 == 0 && n%3 == 0 && n%5 == 0) or
            if(n%30 == 0) {
                System.out.print(n+ " ");
                c++;
            }
            n++;
        }
        System.out.println();   
    }
}