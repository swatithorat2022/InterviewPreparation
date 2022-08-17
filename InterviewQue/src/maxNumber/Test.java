package maxNumber;

public class Test 
{
	
	static int largestNum(int a, int b)
    {
		int c=((a/b)>0 ?1: 0);
		int d=((b/a)>0 ? 1: 0);
		System.out.println(c);
		System.out.println(d);
        return a * ((a / b) > 0 ? 1 : 0) + b * ((b / a) > 0 ? 1 : 0);
    }
 
    // Drivers code
    public static void main(String[] args)
    {
        int a = 22, b = 1231;
        System.out.print(largestNum(a, b));
    }
}


