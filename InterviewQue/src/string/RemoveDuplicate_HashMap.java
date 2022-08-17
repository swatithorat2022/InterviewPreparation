package string;

import java.util.HashMap;

public class RemoveDuplicate_HashMap {

	public static void main(String[] args) 
	{
	
		int arr[]= {1,2,6,8,9,4,2,0,1,8};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.remove(arr[i]);
			}
			else
			{
				map.put(arr[i], i);
			}
		}
		
		for(Integer x:map.keySet())
		{
			 System.out.println(x);
		}

	}

}
