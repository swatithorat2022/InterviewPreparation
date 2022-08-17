package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		String str="India is my country";
		String str1=str.toLowerCase();
		String s1[]=str.split("\\s");
		
		char []ch=str1.toCharArray();  	
		int len=ch.length;
		String finalstr="";
		ArrayList< Character> al=new ArrayList<>();
		
			
		for(int i=0;i<len;i++)
		{
			al.add(ch[i]);
			
		}
		
		Set<Character> st1=new LinkedHashSet(al);
		System.out.println(st1);
		
		
	}

}
