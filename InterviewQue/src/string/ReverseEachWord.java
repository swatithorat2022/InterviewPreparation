package string;

public class ReverseEachWord {

	public static void main(String[] args) 
	{
		String str="My name is Swati Thorat";
		String ss[]=str.split("\\s");
		String result="";
		for(String w:ss)
		{
			int j=w.length()-1;
			char ch[]=w.toCharArray();
			while(j>=0)
			{
				result+=ch[j];
				j--;
			}
			
			result+=" ";
		}
		
		System.out.println(result);

	}

}
