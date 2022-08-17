package string;

public class ReversString {

	public static void main(String[] args) 
	{
		
		String str=new String("Hello world");
		System.out.println("This is reverse string prog.");
		char []ch=str.toCharArray();
		int len=ch.length;
		String rev="";
		char []rev1=new char[len];
		System.out.println(ch);
		int j=0;
		for(int i=len-1;i>=0;i--)
		{
			
				rev+=ch[i];
				rev1[j]=ch[i];
				j++;
						
		}
		String str1=new String(rev1);
		System.out.println(str1);
		
		
		System.out.println(rev.toString());

	}

}
