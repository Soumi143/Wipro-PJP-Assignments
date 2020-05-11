class C
{
	public static void main(String arg[])
	{	
		int x,y,sum;

		 x= Integer.parseInt(arg[0]);
		 y= Integer.parseInt(arg[1]);
		sum = x+y;

		System.out.println("The sum of "+x+ " and "+y+ " is "+sum);
	}
}




/* 
    Compilation : javac C.java
    Execution : java C 10 20
*/