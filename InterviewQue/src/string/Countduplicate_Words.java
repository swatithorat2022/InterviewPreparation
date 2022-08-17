package string;

import java.util.HashMap;

import org.seleniumhq.jetty9.http.pathmap.MappedResource;

public class Countduplicate_Words {

	public static void main(String[] args) 
	{
		String str="I am learning learning java java programme";
		String arr[]=str.split(" ");
		//System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);	
		}
		
		HashMap<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i],1);
			}
			else
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
		}

		
		for(String s:map.keySet())
		{
			if(map.get(s)>1)
			{
				System.out.println("Duplicate word is : -"+s+"-  and Count of it is: "+map.get(s));
			}
		}
	}

}
