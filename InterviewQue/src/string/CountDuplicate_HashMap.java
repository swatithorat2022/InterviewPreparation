package string;

import java.util.HashMap;

public class CountDuplicate_HashMap {

	public static void main(String[] args)
	{
		
		int arr[]= {1,5,7,2,3,2,1,8,9,3};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			 if(!map.containsKey(arr[i]))
			 {
				 map.put(arr[i], 1);
			 }
			 else
			 {
				 map.put(arr[i], map.get(arr[i])+1);
			 }
		}
		
		for(Integer x:map.keySet())
		{
			if(map.get(x)>1)
			{
			System.out.println("Duplicate element is: "+x);
		}

	}

	}
}

