package array;

import java.util.Arrays;

public class StringArray_Sort 
{

	public static void main(String[] args) 
	{
		
		
		String [] inputlist= {"jan","Feb","Mar","April"};
		
		System.out.println(" String array before Sorting");
		
		showlist(inputlist);
		
		Arrays.sort(inputlist,String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(" String array  After Sorting");
		showlist(inputlist);
		
	}
	
	
	public static void showlist(String array[])
	{
		
		int len=array.length;
		
		for(int i=0;i<len;i++)
		{
			System.out.println(array[i]);
		}
	}
}
