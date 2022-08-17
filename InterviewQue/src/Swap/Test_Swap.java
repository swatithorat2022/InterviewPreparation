package Swap;

public class Test_Swap 
{
	
	public void swap(int a,int b)
	{
		System.out.println("Before swapping numbers are: "+a+", "+b);
		
		a=a+b;
		b=a-b; //a
		a=a-b; //a+b-a
		System.out.println("After swapping numbers are: "+a+", "+b);
		
	}
	public static void main(String[] args)
	{
		Test_Swap t=new Test_Swap();
		t.swap(25, 35);
		
		
		
	}

}
