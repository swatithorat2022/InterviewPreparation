package string;

public class ReverseSentence {

	public static void main(String[] args) 
	{
		
		String str="My nname is swati Thorat";
		String ss[]=str.split("\\s");
		int len=ss.length;
		String result="";
		for(int i=len-1;i>=0;i--)
		{
			result+=ss[i]+" ";
		}

		
			System.out.print(result);
		
	}

}
