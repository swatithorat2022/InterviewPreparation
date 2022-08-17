package str_13_07_22;

public class Test_revrese {

	public static void main(String[] args) 
	{
	
		String str="my java";
		char[]ch=str.toCharArray();
		int len=ch.length;
		String rev="";
		System.out.println(str);
		
		for(int i=len-1;i>=0;i--)
		{
			rev+=ch[i];
			
		}
			
		System.out.println(rev);
		

	}

}
