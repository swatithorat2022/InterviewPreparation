package string;

import java.util.HashMap;

public class FindDuplicateChararcters {

	public static void main(String[] args) 
	{
		String str="java";
		char c[]=str.toCharArray();
		int len=c.length;
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<len;i++)
		{
			if(!map.containsKey(c[i]))
			{
				map.put(c[i], 1);
			}
			else
			{
				map.put(c[i], map.get(c[i])+1);
			}
		}
		for(Character ch:map.keySet())
		{
			if(map.get(ch)>1)
			{
				System.out.println("Duplicate character is:  "+ch+", count is : "+map.get(ch));
			}
		}

	}

}
