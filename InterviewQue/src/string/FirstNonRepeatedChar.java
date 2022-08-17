package string;

import java.util.LinkedHashMap;

public class FirstNonRepeatedChar {

	public static void main(String[] args)
	{
		String str="swiss";
		char ch[]=str.toCharArray();
		int len=ch.length;
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<len;i++)
		{
			if(!map.containsKey(ch[i]))
			{
				map.put(ch[i], 1);
			}
			else
			{
				map.put(ch[i],map.get(ch[i])+1);
			}
		}
		
		for(Character c:map.keySet())
		{
			if(map.get(c)==1)
			{
				System.out.println("First non repeted chararcter is: "+c);
				break;
			}
		}

	}

}
