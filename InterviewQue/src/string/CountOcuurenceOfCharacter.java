package string;

public class CountOcuurenceOfCharacter {

	public static void main(String[] args) 
	{
		String str="Java is a object oriented language";
		
		int len=str.length();
		String str1=str.replaceAll("o","");
        int len1=str1.length();
        int cnt=len-len1;
        System.out.println(" Occurence of character o is : "+cnt);

	}

}
