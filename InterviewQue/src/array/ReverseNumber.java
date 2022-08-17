package array;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		
		long num=61534;
		System.out.println("Number before reversing is: "+num);
		long rev=reverse(num);
		System.out.println("reverse number is: "+rev);
		
	}
	
	
	public static long reverse(long n)
	{
		
		long invert=0;
		while(n!=0)
		{
			invert=(invert*10)+(n%10);
			n=n/10;
			
			
		}
		return invert;
	}
}
