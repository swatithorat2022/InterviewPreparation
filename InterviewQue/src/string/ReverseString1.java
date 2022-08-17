package string;

public class ReverseString1 {

	public static void main(String[] args) 
	{
	 String str="Swati";
	 StringBuilder sb=new StringBuilder(str);
	 sb.reverse();
	 System.out.println(sb);
	 
	 char c[]=str.toCharArray();
	 String rev="";
	 for(int i=c.length-1;i>=0;i--)
	 {
		 rev+=c[i];
	 }
	 System.out.println("reverse string is: "+rev);

	}

}
