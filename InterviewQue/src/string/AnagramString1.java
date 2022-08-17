package string;

import java.util.Arrays;

public class AnagramString1 {

	public static void main(String[] args) 
	{
		 String str="Array";
		 String str1="rraya";
		 String s1=str.replaceAll("\\s", "");
		 String s2=str.replaceAll("\\s", "");
		 char ch1[]=s1.toLowerCase().toCharArray();
		 char ch2[]=s2.toLowerCase().toCharArray();
		 int len1=ch1.length;
		 int len2=ch2.length;
		 boolean status; 
		 if(len1!=len2)
		 {
			status =false;
		 }
		 else
		 {
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 status=Arrays.equals(ch1, ch2);
			 
		 }
		 
		 
		 if(status)
		 {
			 System.out.println(" Strings are Anagram");
		 }
		 else
		 {
			 System.out.println("Strings are not Anagram");
		 }
		

	}

}
