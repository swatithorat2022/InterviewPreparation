package array;

public class PrimeNumber {

	public static void main(String[] args)
	{
		

		int num =7;
		prime(num);
		
		
	}
	
	public static void prime(int no)
	{
		int m=no/2;
		int flag=0;
		if(no==0||no==1)
		{
			System.out.println("Number is not a prime");
		}
		else
		{
		for(int i=2;i<=no-1;i++)
		{
		if(no%i==0)
		{
			System.out.println("Number is not prime");
			flag++;
			break;
		}
		
		
		}
		
		if(flag==0)
		{
			System.out.println("Number is prime");
		}
	}

	}
}

